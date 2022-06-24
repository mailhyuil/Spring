<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />    
<<<<<<< HEAD
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
   <link rel="icon" type="image/x-icon" href="/static/img/favicon.ico">
<title>schoolverse</title>
<style>
	form.join {
		width: 70%;
		margin:20px auto;
		padding:20px;
	}
	
	form.join input, form.join button {
		margin:5px;
	}
	
	form.join label {
		font-weight: bold;
	}
	
</style>
<script src="/static/js/join.js?202206010009"></script>
</head>
<body>

<form method="POST" class="w3-container w3-card-4 join">
	
	<h2>학원등록하기</h2>
	
	<label class="w3-text-blue">학원이름</label>
	<input name="aca_name" id="aca_name" placeholder="aca_name" class="w3-input w3-border">

	
	<label class="w3-text-blue">학원과목</label>
	<input name="aca_subject" id="aca_subject" placeholder="aca_subject" class="w3-input w3-border">

	
	<label class="w3-text-blue">학원 주소</label>
	<input name="aca_addr" id="aca_addr" placeholder="aca_addr" class="w3-input w3-border">

	
	<label class="w3-text-blue">학원 소개</label>
	<input name="aca_info" id="aca_info" placeholder="aca_info" class="w3-input w3-border">

	
	<label class="w3-text-blue">학원 이미지</label>
	<input type="file" name="aca_img" id="aca_img" placeholder="aca_img" class="w3-input w3-border">
	<button>선생님 추가</button>
<div class="teacher_add">
	<label class="w3-text-blue">선생님 이름</label>
	<input name="aca_teacher" id="aca_teacher" placeholder="aca_teacher" class="w3-input w3-border">
	<label class="w3-text-blue">선생님 소개</label>
	<input name="aca_teacher" id="aca_teacher" placeholder="aca_teacher" class="w3-input w3-border">
</div>

	<h2>수업 추가하기</h2>
	<button>수업 추가</button>
<div class="class_add">	
	<label class="w3-text-blue">수업이름</label>
	<input name="class_name" id="class_name" placeholder="class_name"  class="w3-input w3-border">
	
	<label class="w3-text-blue">수업과목</label>
	<input name="class_subject" id="class_subject" placeholder="class_subject"  class="w3-input w3-border">

	<label class="w3-text-blue">수업료</label>
	<input name="class_fee" id="class_fee" placeholder="class_fee"  class="w3-input w3-border">
	<button>수업시간 추가</button>
	<div>
	<select>
	<option name="sche_day" id="sche_day">월</option>
	<option name="sche_day" id="sche_day">화</option>
	<option name="sche_day" id="sche_day">수</option>
	<option name="sche_day" id="sche_day">목</option>
	<option name="sche_day" id="sche_day">금</option>
	<option name="sche_day" id="sche_day">토</option>
	<option name="sche_day" id="sche_day">일</option>
	</select></br>
	<label>09:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="09:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>10:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="10:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>11:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="11:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>12:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="12:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>13:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="13:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>14:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="14:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>15:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="15:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>16:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="16:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>17:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="17:00" placeholder="sche_period"  class="w3-input w3-border">
	<label>18:00</label>
	<input type="checkbox" name="sche_period" id="sche_period" value="18:00" placeholder="sche_period"  class="w3-input w3-border">
	</div>
</div>	
	<button class="w3-button w3-blue" id="btn-join" type="button">등록하기</button>
</form>




=======
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="icon" type="image/x-icon" href="/static/img/favicon.ico">
    <title>schoolverse</title>
    <style>
        form.join {
            width: 70%;
            margin: 20px auto;
            padding: 20px;
        }

        form.join input,
        form.join button {
            margin: 5px;
        }

        form.join label {
            font-weight: bold;
        }

        div:not(:schdule-period) {
            display: flex;
            flex-direction: column;
        }
    </style>
</head>

<body>

    <form method="POST" class="w3-container w3-card-4 join">

        <h2>학원등록하기</h2>
        <div class="block">
            <label class="w3-text-blue">학원이름</label>
            <input name="aca_name" id="aca_name" placeholder="aca_name">
        </div>
        <div class="block">
            <label class="w3-text-blue">학원과목</label>
            <select name="aca_subject">
                <option id="sche_day">입시</option>
                <option id="sche_day">영어</option>
                <option id="sche_day">예체능</option>
            </select>
        </div>
        <div class="block">
            <label class="w3-text-blue">교육대상</label>
            <select name="aca_age">
                <option>학생</option>
                <option>성인</option>
            </select>
        </div>
        <div class="block">
            <label class="w3-text-blue">지역</label>
            <select name="aca_region">
                <option>서구</option>
                <option>남구</option>
                <option>북구</option>
                <option>광산구</option>
            </select>
        </div>

        <div class="block">
            <label class="w3-text-blue">학원 주소</label>
            <input name="aca_addr" id="aca_addr" placeholder="aca_addr">
        </div>
        <div class="block">
            <label class="w3-text-blue">학원 소개</label>
            <textarea name="aca_info" id="aca_info"></textarea>
        </div>
        <div class="block">
            <label class="w3-text-blue">학원 이미지</label>
            <input type="file" name="aca_img" id="aca_img" placeholder="aca_img">
        </div>


        <!-- ////////////////////////////////////////////////////////////////////////////////////// -->



        <button type="button" class="teacher_add">선생님 추가</button>
        <div class="teacher_block">
        </div>
        <button id="btn-join" type="submit">등록하기</button>
    </form>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc



</body>
<<<<<<< HEAD
</html>
=======
<script src="/static/js/register.js?asssssssdsssf"></script>
</html>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
