<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="function.css" />
    <title>기능명세서</title>
  </head>
  <body>
    <table>
      <caption>
        기능 명세서
      </caption>
      <tr>
        <th>식당</th>
        <th>식당분류</th>
        <th>기념품</th>
        <th>관광지</th>
        <th>숙소</th>
        <th>숙소분류</th>
        <th>지불금액</th>
        <th>경기종목</th>
        <th>종목별 경기</th>
        <th>경기장</th>
        <th>경기장번호</th>
        <th>경기일정</th>
        <th>티켓</th>
        <th>티켓기능</th>
        <th>예약테이블</th>
        <th>회원정보</th>
        <th>고객센터</th>
        <th>리뷰(평점)</th>
      </tr>
      <tr>
        <td>
          <ol>
            <li>식당코드(pk)</li>
            <li>가게명</li>
            <li>위치</li>
            <li>전화번호</li>
            <li>평균값</li>
            <li>식당분류코드(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>식당분류코드(pk)</li>
            <li>식당분야명</li>
            <li>금액(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>기념품코드(pk)</li>
            <li>특산품</li>
            <li>굿즈</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>관광지코드(pk)</li>
            <li>위치</li>
            <li>전화번호</li>
            <li>기념품코드(fk)</li>
            <li>금액(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>숙소코드(pk)</li>
            <li>전화번호</li>
            <li>위치</li>
            <li>가격</li>
            <li>숙소명</li>
            <li>평점</li>
            <li>조식가능유무</li>
            <li>숙소분류코드(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>숙소분류코드(pk)</li>
            <li>숙소분야명</li>
            <li>금액(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>금액(pk)</li>
            <li>숙소</li>
            <li>식사</li>
            <li>기념품</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>경기종목코드(pk)</li>
            <li>핸드볼</li>
            <li>수구</li>
            <li>축구</li>
            <li>배드민턴</li>
            <li></li>
            <li></li>
            <li></li>
          </ol>
        </td>
        <td>
          <ol>
            <li>경기코드(pk)</li>
            <li>경기1</li>
            <li>경기2</li>
            <li>경기3</li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
          </ol>
        </td>
        <td>
          <ol>
            <li>경기장 코드(pk)</li>
            <li>경기장위치</li>
            <li>경기장번호</li>
            <li>경기일정</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>경기장번호코드(pk)</li>
            <li>총좌석수</li>
            <li></li>
            <li></li>
          </ol>
        </td>
        <td>
          <ol>
            <li>경기일정코드(pk)</li>
            <li>경기일자</li>
            <li>경기코드(fk)</li>
            <li>티켓코드(fk)</li>
            <li>경기장번호코드(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>티켓코드(pk)</li>
            <li>경기일정번호</li>
            <li>가격</li>
            <li>좌석번호(fk)</li>
            <li>금액(fk)</li>
            <li>경기코드(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>예약</li>
            <li>취소</li>
            <li>조회</li>
            <li>티켓코드(fk)</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>예약테이블코드(pk)</li>
            <li>시작날짜</li>
            <li>종료날짜</li>
            <li></li>
          </ol>
        </td>
        <td>
          <ol>
            <li>회원코드(pk)</li>
            <li>아이디</li>
            <li>비밀번호</li>
            <li>이름</li>
            <li>전화번호</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>고객센터 코드(pk)</li>
            <li>후기사항</li>
          </ol>
        </td>
        <td>
          <ol>
            <li>리뷰 코드(pk)</li>
            <li>회원이름</li>
            <li>패키지 후기</li>
          </ol>
        </td>
      </tr>
    </table>
  </body>
</html>