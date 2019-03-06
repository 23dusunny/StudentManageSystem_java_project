import java.util.*;
public class Test {
	public static void main(String[] args){
		System.out.println("----------请定义人数----------");
		Scanner in=new Scanner(System.in);
		Student[] stuArr=new Student[in.nextInt()];//in.nextInt()用来接收用户输入的整型,数组的长度和输入的人数是一致的。
		Admin adminStu=new Admin();
		while(true){
			System.out.println("-----请选择你要执行的功能：-----");
			System.out.println("10：添加一个学生");
			System.out.println("11：查找一个学生");	
			System.out.println("12：根据学生编号更新学生基本信息");
			System.out.println("13：根据学生编号删除学生信息");
			System.out.println("14：根据编号输入学生的各门成绩");
			System.out.println("15：根据某门成绩进行排序");
			System.out.println("16:根据总分进行排序");
			System.out.println("99：退出系统");
			String number=in.next();
			if(number.equals("10")){
				System.out.println("请输入学生的姓名：");
				String name=in.next();
				System.out.println("请输入学生的年龄：");
				int age=in.nextInt();
				adminStu.create(name, age, stuArr);//添加学生
			}else if(number.equals("11")){
				System.out.println("执行查找学生的基本操作");
				System.out.println("请输入学生的编号进行查找：");
				int on=in.nextInt();//接收编号
				adminStu.select(on,stuArr);//调用查找
			}else if(number.equals("12")){
				System.out.println("-----更新成员的基本信息-----");
				System.out.println("输入学生的编号");
				int on=in.nextInt();
				System.out.println("请输入学生的姓名");
				String name=in.next();
				System.out.println("请输入学生的年龄");
				int age=in.nextInt();
				adminStu.update(on,name,age,stuArr);
			}else if(number.equals("13")){
				System.out.println("-----执行删除学生的操作-----");
				System.out.println("请输入学生的编号");
				int on=in.nextInt();
				adminStu.delete(on,stuArr);
			}else if(number.equals("14")){
				System.out.println("-----执行输入成绩的操作-----");
				System.out.println("请输入学生的编号");
				int on=in.nextInt();
				adminStu.input(on,stuArr);
			}else if(number.equals("15")){
				System.out.println("-----执行根据成绩排序的操作-----");
				System.out.println("请选择用什么成绩进行排序？(1.Java 2.c# 3.Html 4.Sql)");
				int num=in.nextInt();
				adminStu.courseSort(num,stuArr);
			}else if(number.equals("16")){
				System.out.println("-----根据总分进行排序的操作-----");
				adminStu.sumSort(stuArr);
			}else if(number.equals("99")){
				System.out.println("程序已经退出");
				System.exit(0);//退出。也可以用break  break是跳出循环，exit不是跳出循环，而是直接结束
			}


		}
	}
}
