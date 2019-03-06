public class Student {//一个好的类属性要进行封装
private	int on;
private	String name;
private	int age;
private	int java;
private	int c_shar;
private	int html;
private	int sql;
private	int sum;
private	int avg;
//一个属性具备两个方法赋值和取值
public void setOn(int on){
	this.on=on;//把传递的参数赋值给当前的on
}
public int getOn(){//取值必须返回
	return this.on;
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return this.age;
}
public void setAge(int age) {
	this.age = age;
}
public int getJava() {
	return java;
}
public void setJava(int java) {
	this.java = java;
}
public int getC_shar() {
	return c_shar;
}
public void setC_shar(int c_shar) {
	this.c_shar = c_shar;
}
public int getHtml() {
	return html;
}
public void setHtml(int html) {
	this.html = html;
}
public int getSql() {
	return sql;
}
public void setSql(int sql) {
	this.sql = sql;
}
public int getSum() {
	return sum;
}
public void setSum() {
	this.sum = this.java+this.sql+this.html+this.c_shar;
}
public void setAvg() {
	this.avg = (this.sum)/4;
}
public int getAvg() {
	return avg;
}
//重写toString()方法,默认toString()返回的是哈希码值
public String toString(){
	String msg="\t"+this.on+"\t"+this.name+"\t"+this.age+"\t"+this.java+"\t"
+this.c_shar+"\t"+this.html+"\t"+this.sql+"\t"+this.sum+"\t"+this.avg;
	return msg;
}
}
