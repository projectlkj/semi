<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">

	function getList() {
		let xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(){
			if(xhr.readyState==4 && xhr.status==200){
				let data = xhr.responseText;
				let json = JSON.parse(data);
				let div = document.getElementById("result");
				for(let i =0;i<json.list.length;i++){
					div.innerHTML += "아이디:"+json.list[i].id+"<br>비밀번호:"+json.list[i].pwd+"<br>이메일:"+json.list[i].email
					+"<br>나이:"+json.list[i].age+"<br>등록일:"+json.list[i].regdate+"<br>"
				}

			}
		};

	xhr.open('get','server3.jsp',true);
	xhr.send();
		
	}



</script>
<body>
<!-- btn1을 클릭하면 json데이터를 얻어와 div#result에 출력 -->
<input type="button" value="데이터받아오기" id="btn1" onclick="getList()">
<div id = "result">

</div>
</body>
</html>