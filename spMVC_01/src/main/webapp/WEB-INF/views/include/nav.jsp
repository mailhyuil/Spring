<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>My page</title>
    <style>
      * {
        box-sizing: border-box;
      }
      nav ul {
        display: flex;
        background-color: black;
        color: white;
        list-style: none;
      }
      nav li {
        padding: 11px 16px;
      }
      nav li:hover {
        background-color: #eee;
        color: blue;
        font-weight: 500;
      }
    </style>
  </head>
  <body>
    <nav>
      <ul>
        <li>Home</li>
        <li>공지사항</li>
        <li>자유게시판</li>
        <li>로그인</li>
        <li>회원가입</li>
      </ul>
    </nav>
  </body>
</html>