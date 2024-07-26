CREATE TABLE memberinformation (
    member_code INT PRIMARY KEY AUTO_INCREMENT,
    id VARCHAR(50),
    password VARCHAR(50),
    name VARCHAR(50),
    phone VARCHAR(50)
);
-- 지불금액
CREATE TABLE payment_amount (
    payment_amount_code INT PRIMARY KEY AUTO_INCREMENT,
    lodging VARCHAR(50),
    meal VARCHAR(20),
    goods VARCHAR(50),
    ticket VARCHAR(50),
    sum_price INT,
    member_code INT,
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code)
);
-- 경기장
CREATE TABLE stadium (
    stadium_code INT PRIMARY KEY AUTO_INCREMENT,
    stadium_event VARCHAR(20),
    game VARCHAR(20),
    game_schedule TEXT
);
-- 경기장예약
CREATE TABLE stadium_reservation (
    stadium_reservation_code INT PRIMARY KEY AUTO_INCREMENT,
    start_date CHAR(15),
    end_date CHAR(15),
    price INT,
    stadium_code INT,
    member_code INT,
    payment_amount_code INT,
    FOREIGN KEY (stadium_code) REFERENCES stadium (stadium_code),
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code),
    FOREIGN KEY (payment_amount_code) REFERENCES payment_amount (payment_amount_code)
);
-- 관광지
CREATE TABLE theme_park (
    theme_code INT PRIMARY KEY AUTO_INCREMENT,
    location VARCHAR(40),
    themePhone VARCHAR(15),
    guide VARCHAR(50)
);
-- 관광지예약
CREATE TABLE theme_park_reservation (
    theme_reservation_code INT PRIMARY KEY AUTO_INCREMENT,
    payment_amount_code INT,
    theme_code INT,
    member_code INT,
    FOREIGN KEY (payment_amount_code) REFERENCES payment_amount (payment_amount_code),
    FOREIGN KEY (theme_code) REFERENCES theme_park (theme_code),
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code)
);
-- 기념품
CREATE TABLE goods (
    goods_code INT PRIMARY KEY AUTO_INCREMENT,
    local_goods VARCHAR(50),
    special_goods VARCHAR(50),
    payment_amount_code INT,
    FOREIGN KEY (payment_amount_code) REFERENCES payment_amount (payment_amount_code)
);
-- 식당분류
CREATE TABLE restaurant_classification (
    restaurant_classification_code INT PRIMARY KEY AUTO_INCREMENT,
    restaurant_sector VARCHAR(30)
);
-- 식당
CREATE TABLE restaurant (
    restaurant_code INT PRIMARY KEY AUTO_INCREMENT,
    restaurant_name VARCHAR(20),
    restaurant_location VARCHAR(30),
    restaurant_phone VARCHAR(15),
    avg_price INT,
    restaurant_classification_code INT,
    FOREIGN KEY (restaurant_classification_code) REFERENCES restaurant_classification (restaurant_classification_code)
);
-- 식당예약
CREATE TABLE restaurant_reservation (
    reservation_code INT PRIMARY KEY AUTO_INCREMENT,
    date CHAR(10),
    time CHAR(10),
    people INT,
    amount INT,
    payment_amount_code INT,
    restaurant_code INT,
    member_code INT,
    FOREIGN KEY (payment_amount_code) REFERENCES payment_amount (payment_amount_code),
    FOREIGN KEY (restaurant_code) REFERENCES restaurant (restaurant_code),
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code)
);
-- 리뷰 (평점)
DROP TABLE review;

CREATE TABLE review (
    review_code INT PRIMARY KEY AUTO_INCREMENT,
    review_date CHAR(30),
    package_review VARCHAR(100),
    member_code INT,
    payment_amount_code INT,
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code),
    FOREIGN KEY (payment_amount_code) REFERENCES payment_amount (payment_amount_code)
);
-- 질문게시판
CREATE TABLE question_table (
    question_code INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    qna VARCHAR(100),
    member_code INT,
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code)
);
-- 숙소분류
CREATE TABLE lodging_classification (
    lodging_classification_code INT PRIMARY KEY AUTO_INCREMENT,
    classification_name VARCHAR(70)
);
-- 숙소
CREATE TABLE lodging (
    lodging_code INT PRIMARY KEY AUTO_INCREMENT,
    phone VARCHAR(50),
    location VARCHAR(70),
    price INT,
    name_of_lodging VARCHAR(70),
    breakfast_availability VARCHAR(30),
    lodging_classification_code INT,
    FOREIGN KEY (lodging_classification_code) REFERENCES lodging_classification (lodging_classification_code)
);
-- 숙소예약
CREATE TABLE lodging_reservation (
    reservation_code INT PRIMARY KEY AUTO_INCREMENT,
    date CHAR(10),
    time VARCHAR(50),
    headcount INT,
    price INT,
    payment_amount_code INT,
    lodging_code INT,
    member_code INT,
    FOREIGN KEY (payment_amount_code) REFERENCES payment_amount (payment_amount_code),
    FOREIGN KEY (lodging_code) REFERENCES lodging (lodging_code),
    FOREIGN KEY (member_code) REFERENCES memberinformation (member_code)
);