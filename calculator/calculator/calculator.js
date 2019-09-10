var num1 = "";
var num2 = "";
var op = "";
var flag = 0;
var numberflag = 0
var result = "";
var textflag = 0;
var ifflag = 0;
function numberBtnHandler(number)
{
	if (numberflag ==1){
		setText('')
		numberflag = 0;
	}
	setText(getText() + number)
	
}
function textBtnhandler(text){
	if (textflag == 1){
		alert('input error ..');
		textflag = 0;
	}
	else{
	setText(getText() + text);
	textflag = 1;	
	}
}

function setText(text)
{
	document.getElementById("textBox").value = text;	
}

function getText()
{
	return document.getElementById("textBox").value;
}

function reset()
{
	setText("");
}

function calculate(input_op){
	numberflag = 1;
	
	if (flag == 0){
		num1 = getText();
		op = input_op
		flag = 1;
	}

	
	if (flag == 1) {
		num2 = getText();
		if(op == '+'){
			num1 = Number(num1) + Number(num2)
			if (ifflag ==1){
				setText(num1)
			}
			ifflag = 1;
		}
		else if(op == '-')
			result = num1 - num2
		else if(op == '*')
			result = num1 * num2
		else if (op == '/')
			result = num1 / num2
		setText(result)
		flag = 0
	}
}