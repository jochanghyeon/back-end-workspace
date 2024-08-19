-- SET foreign_key_checks = 1; 
-- 회원 정보
CREATE TABLE Mem_info (
    mem_code INT PRIMARY KEY AUTO_INCREMENT,
    id VARCHAR(50),
    password VARCHAR(50),
    name VARCHAR(50),
    phone VARCHAR(15)
);

-- 지불금액
CREATE TABLE Pmt_amt (
    pmt_amt_code INT PRIMARY KEY AUTO_INCREMENT,
    accom VARCHAR(50),
    meal VARCHAR(20),
    goods VARCHAR(50),
    ticket VARCHAR(50),
    sum_price INT,
    mem_code INT,
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code)
);

-- 식당분류
CREATE TABLE Rest_class (
    rest_class_code INT PRIMARY KEY AUTO_INCREMENT,
    rest_sector VARCHAR(30)
);

-- 숙소분류
CREATE TABLE Accom_class (
    accom_class_code INT PRIMARY KEY AUTO_INCREMENT,
    class_name VARCHAR(70)
);

-- 경기장
CREATE TABLE Stadium (
    stadium_code INT PRIMARY KEY AUTO_INCREMENT,
    stadium_event VARCHAR(20),
    game VARCHAR(20),
    game_skd TEXT
);

-- 경기장예약
CREATE TABLE Stadium_res (
    stadium_res_code INT PRIMARY KEY AUTO_INCREMENT,
    start_date CHAR(15),
    end_date CHAR(15),
    price INT,
    stadium_code INT,
    mem_code INT,
    pmt_amt_code INT,
    FOREIGN KEY (stadium_code) REFERENCES stadium (stadium_code),
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code),
    FOREIGN KEY (pmt_amt_code) REFERENCES pmt_amt (pmt_amt_code)
);

-- 관광지
CREATE TABLE Theme_park (
    theme_code INT PRIMARY KEY AUTO_INCREMENT,
    location VARCHAR(40),
    theme_phone VARCHAR(15),
    guide VARCHAR(50)
);

-- 관광지예약
CREATE TABLE Theme_park_res (
    theme_res_code INT PRIMARY KEY AUTO_INCREMENT,
    pmt_amt_code INT,
    theme_code INT,
    mem_code INT,
    FOREIGN KEY (pmt_amt_code) REFERENCES pmt_amt (pmt_amt_code),
    FOREIGN KEY (theme_code) REFERENCES theme_park (theme_code),
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code)
);

-- 기념품
CREATE TABLE Goods (
    goods_code INT PRIMARY KEY AUTO_INCREMENT,
    local_goods VARCHAR(50),
    special_goods VARCHAR(50),
    pmt_amt_code INT,
    FOREIGN KEY (pmt_amt_code) REFERENCES pmt_amt (pmt_amt_code)
);

-- 식당
CREATE TABLE Rest (
    rest_code INT PRIMARY KEY AUTO_INCREMENT,
    rest_name VARCHAR(20),
    rest_location VARCHAR(30),
    rest_phone VARCHAR(15),
    avg_price INT,
    rest_class_code INT,
    FOREIGN KEY (rest_class_code) REFERENCES rest_class (rest_class_code)
);

-- 식당예약
CREATE TABLE Rest_res (
    reservation_code INT PRIMARY KEY AUTO_INCREMENT,
    date CHAR(10),
    time CHAR(10),
    people INT,
    amount INT,
    pmt_amt_code INT,
    rest_code INT,
    mem_code INT,
    FOREIGN KEY (pmt_amt_code) REFERENCES pmt_amt (pmt_amt_code),
    FOREIGN KEY (rest_code) REFERENCES rest (rest_code),
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code)
);

-- 리뷰 (평점)
CREATE TABLE Review (
    review_code INT PRIMARY KEY AUTO_INCREMENT,
    review_date CHAR(30),
    package_review VARCHAR(100),
    mem_code INT,
    pmt_amt_code INT,
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code),
    FOREIGN KEY (pmt_amt_code) REFERENCES pmt_amt (pmt_amt_code)
);

-- 질문게시판
CREATE TABLE Question_table (
    question_code INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    qna VARCHAR(100),
    mem_code INT,
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code)
);

-- 숙소
CREATE TABLE Accom (
    accom_code INT PRIMARY KEY AUTO_INCREMENT,
    phone VARCHAR(15),
    location VARCHAR(70),
    price INT,
    name_of_accom VARCHAR(70),
    breakfast_availability VARCHAR(30),
    accom_class_code INT,
    FOREIGN KEY (accom_class_code) REFERENCES accom_class (accom_class_code)
);

-- 숙소예약
CREATE TABLE Accom_res (
    res_code INT PRIMARY KEY AUTO_INCREMENT,
    date CHAR(10),
    time VARCHAR(50),
    headcount INT,
    price INT,
    pmt_amt_code INT,
    accom_code INT,
    mem_code INT,
    FOREIGN KEY (pmt_amt_code) REFERENCES pmt_amt (pmt_amt_code),
    FOREIGN KEY (accom_code) REFERENCES accom (accom_code),
    FOREIGN KEY (mem_code) REFERENCES mem_info (mem_code)
    );