function doDelete(){	
			document.forms[0].action += "deletereserve";
			
			if(confirm("ȷ�ϲ���?") == false)
			return;
			
			document.forms[0].submit();	
		}
		
		var passenger_max=0;
		function doInsertPassenger(){
			if(confirm("ȷ�ϲ���?") == false){
				return;
 			}
 			if($(".passenger").length>=9){
 				alert("������������");
 				return;
 			}
 			passenger_max=passenger_max+1;  
 			
 			var new_passenger= document.createElement("div"); 
 			new_passenger.innerHTML = $(".passenger")[0].innerHTML;
 			new_passenger.id=("passenger"+passenger_max);
 			new_passenger.className ="passenger";
 			new_passenger.getElementsByTagName("a")[1].deleteid=("passenger"+passenger_max);
 			
 			document.getElementById("list_passenger").appendChild(new_passenger); 
 			
 			
		}
		
		function doDeletePassenger(now){
			if(confirm("ȷ��ɾ��?") == false){
				return;
 			}
 			if($(".passenger").length<=1){
 				alert("ɾ����������");
 				return;
 			}
 			
 			document.getElementById(now.deleteid).parentNode.removeChild(document.getElementById(now.deleteid));
		}

		function change_passenger(now){
			alert(now.value);
		}