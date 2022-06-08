<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

    

    function getData(){
        let xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function(){
            if(xhr.readyState==4 && xhr.status==200){
            	let data = xhr.responseText;
                let json = JSON.parse(data);
                let result = document.getElementById("result");
                          
                result.innerHTML+= "이름:"+json.name +" 나이:"+json.age+" 전화번호:"+json.phone;
              
            
            }
        };
        xhr.open('get','server1.jsp',true);
        xhr.send();
    }



</script>



<input type="button" value="데이터 받아오기" id = "btn1" onclick="getData()">
<div id="result">
</div>
</body>
</html>