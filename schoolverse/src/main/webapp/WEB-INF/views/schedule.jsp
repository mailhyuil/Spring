<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<<<<<<< HEAD
    <title>schoolversee</title>
    <link rel="stylesheet" href="static/css/schedule.css?12sdffff2ss313" />
       <link rel="icon" type="image/x-icon" href="/static/img/favicon.ico">
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=nanq2sq1z7"></script>
=======
    <title>My Page</title>
    <link rel="stylesheet" href="${rootPath }/resources/css/schedule.css" />
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
  </head>

  <body>
    <div class="wrapper">
      <div class="table">
        <table>
<<<<<<< HEAD
        <thead>
          <tr>
            <th class="top-left"></th>
=======
          <tr>
            <th></th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <th>09:00</th>
            <th>10:00</th>
            <th>11:00</th>
            <th>12:00</th>
            <th>13:00</th>
            <th>14:00</th>
            <th>15:00</th>
            <th>16:00</th>
            <th>17:00</th>
<<<<<<< HEAD
            <th class="bottom-left">18:00</th>
          </tr>
          </thead>
          <tbody>
          <tr data-day="mon">
            <th>월</th>
=======
            <th>18:00</th>
          </tr>
          <tr data-day="mon">
            <th>mon</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
            <td data-date="18:00"></td>
          </tr>
          <tr data-day="tue">
<<<<<<< HEAD
            <th>화</th>
=======
            <th>tue</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
            <td data-date="18:00"></td>
          </tr>
          <tr data-day="wed">
<<<<<<< HEAD
            <th>수</th>
=======
            <th>wed</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
            <td data-date="18:00"></td>
          </tr>
          <tr data-day="thu">
<<<<<<< HEAD
            <th>목</th>
=======
            <th>thu</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
            <td data-date="18:00"></td>
          </tr>
          <tr data-day="fri">
<<<<<<< HEAD
            <th>금</th>
=======
            <th>fri</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
            <td data-date="18:00"></td>
          </tr>
          <tr data-day="sat">
<<<<<<< HEAD
            <th>토</th>
=======
            <th>sat</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
            <td data-date="18:00"></td>
          </tr>
          <tr data-day="sun">
<<<<<<< HEAD
            <th class="top-right">일</th>
=======
            <th>sun</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
            <td data-date="09:00"></td>
            <td data-date="10:00"></td>
            <td data-date="11:00"></td>
            <td data-date="12:00"></td>
            <td data-date="13:00"></td>
            <td data-date="14:00"></td>
            <td data-date="15:00"></td>
            <td data-date="16:00"></td>
            <td data-date="17:00"></td>
<<<<<<< HEAD
            <td  class="bottom-right" data-date="18:00"></td>
          </tr>
          </tbody>
        </table>
      <div class="basket">
      <c:forEach items="${CLASS}" var="CLASS" varStatus="status">
      <c:set var="SCHE" value="${SCHE}"/>
          <div
            class="classes"
            data-schedule="${SCHE[status.index]}" data-class_code="${ CLASS.class_code}">
            ${CLASS.class_name}
          </div>
       </c:forEach>
    </div>
       <div class="sub">-</div>
</div>
      <div id="map"></div>
    </div>
      <button class="toPay" onclick="location.href = '/pay' ">
        결제하기
      </button>
      <button class="toSearch" onclick="location.href = '/search' ">
        돌아가기
      </button>
  </body>
  <script src="static/js/schedule.js?123212sssss34"></script>
  <script src="static/js/map_schedule.js?122sssss12341234"></script>
=======
            <td data-date="18:00"></td>
          </tr>
        </table>

        <div class="basket">
          <div
            class="classes"
            data-schedule="mon_09:00,mon_10:00,mon_11:00,wed_09:00,wed_10:00,wed_11:00,fri_09:00,fri_10:00,fri_11:00"
          >
            xx수학학원
          </div>
          <div
            class="classes"
            data-schedule="tue_13:00,tue_14:00,tue_15:00,tue_16:00,fri_13:00,fri_14:00,fri_15:00,fri_16:00"
          >
            zz영어학원
          </div>
          <div
            class="classes"
            data-schedule="mon_13:00,mon_14:00,mon_15:00,mon_16:00,wed_13:00,wed_14:00,wed_15:00,wed_16:00,fri_13:00,fri_14:00,fri_15:00,fri_16:00"
          >
            yy영어학원
          </div>
          <div
            class="classes"
            data-schedule="mon_10:00,mon_11:00,mon_12:00,mon_13:00,tue_10:00,tue_11:00,tue_12:00,tue_13:00"
          >
            oo피아노학원
          </div>
          <div
            class="classes"
            data-schedule="mon_18:00,wed_18:00,fri_18:00,sat_18:00"
          >
            kk태권도
          </div>
        </div>
        <div class="sub">-</div>
      </div>
      <img />
      <button class="toPay" onclick="location.href = '/api/pay' ">
        결제하기
      </button>
      <button class="toSearch" onclick="location.href = '/api/search' ">
        돌아가기
      </button>
    </div>
  </body>
  <script src="${rootPath }/resources/js/schedule.js"></script>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
</html>
