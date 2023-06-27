<!doctype html>
<html lang="ko">
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form name="form" method="get" action="/SiginPage">
    <table>
        <tr>
            <td colspan="3">
                <h2>회원가입</h2>
            </td>
        </tr>
        <tr>
            <td>아이디</td>
            <td><input type="text" placeholder="아이디 입력" name="id"></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="text" placeholder="비밀번호 입력" name="pw"></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">전송</button>
                <button type="reset">초기화</button>
            </td>
        </tr>
    </table>
</form>
</body>
<style>
    td{
        border: 1px solid black;
    }
    table{
        text-align: center;
        margin: 0 auto;
    }
</style>
</html>