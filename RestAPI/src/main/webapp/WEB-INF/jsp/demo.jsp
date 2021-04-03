<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

$( document ).ready(function() {
   
	$('#btn1').on('click', function(){
		
		var params = jQuery("#formname1").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
		
	    $.ajax({
	    	url: "/insa/emp/"+$('#eno').val(),
	        type: "POST",
	        data: params,
	        success: function(data){
	            $('#result').text(data);
	        },
	        error: function(){
	            alert("Insert err");
	        }
	    });
	});
	
	$('#btn2').on('click', function(){
		
		var params = jQuery("#formname1").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
		alert( $('#eno').val());
	    $.ajax({
	        url: "/insa/emp/"+$('#eno').val(),
	        type: "GET",
	        data: params,
	        success: function(data){
	            $('#result2').text(JSON.stringify(data));
	        },
	        error: function(){
	            alert("Select err");
	        }
	    });
	});
	
	$('#btn3').on('click', function(){
		
		var params = jQuery("#formname1").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
		alert( $('#eno').val());
	    $.ajax({
	        url: "/insa/emp/"+$('#eno').val(),
	        type: "DELETE",
	        data: params,
	        success: function(data){
	            $('#result3').text(JSON.stringify(data));
	        },
	        error: function(){
	            alert("Select err");
	        }
	    });
	});
	
	$('#btn4').on('click', function(){
	
		var params = jQuery("#formname1").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
		alert( $('#eno').val());
	    $.ajax({
	        url: "/insa/emp/"+$('#eno').val(),
	        type: "PUT",
	        data: params,
	        success: function(data){
	            $('#result4').text(JSON.stringify(data));
	        },
	        error: function(){
	            alert("Select err");
	        }
	    });
	});
    
    $('#btn5').on('click', function(){
    	
    	var params = jQuery("#formname1").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
    	alert( $('#eno').val());
        $.ajax({
            url: "/insa/emp/"+$('#eno').val()+"/belongsto/dep",
            type: "GET",
            data: params,
            success: function(data){
                $('#result5').text(JSON.stringify(data));
            },
            error: function(){
                alert("Select err");
            }
        });
    });

});
	
</script>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REST SAMPLE Page</title>
</head>
<body>
	

	<form name="formname1" id="formname1">
		사원번호 : <input type="text" id="eno" name="eno" value="10344" size="15"> <br>
		사원이름 : <input type="text"	name="name" value="name" size="50"> <br>
		후대폰번호 : <input type="text"	name="hp" value="hp" size="50"> <br>
		email : <input type="text"	name="email" value="email" size="50"> <br>
		부서번호 : <input type="text"	name="depno" value="100" size="50"> <br>
	</form>
	
	<body>
    <button id="btn1">simpleRest Insert</button>
    	<div id="result"></div>
    	
   	 <button id="btn2">simpleRest Select</button>
    	<div id="result2"></div>
    	
   	<button id="btn3">simpleRest Delete</button>
    	<div id="result3"></div>
    	
   	<button id="btn4">simpleRest Update</button>
    	<div id="result4"></div>
    	
  	 <button id="btn5">simpleRest JOIN</button>
    	<div id="result5"></div>
</body>

</body>

</html>
