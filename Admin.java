import java.util.*;
//用来管理学生的一个类10-99的功能实现
public class Admin {


	String msg="\t编号\t姓名\t年龄\tjava\tc#\thtml\tsql\t总分\t平均分";
	//这个方法用来更新学生类的输出
	public void print(Student[] arr){
		System.out.println(msg);
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
			}
		}
	}
	//根据编号判断学生是否存在
	public boolean exist(int on,Student stu){
		if(stu!=null){
			if(stu.getOn()==on){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	//创建添加学生的方法
	public void create(String name,int age,Student[] arr){
		Student stu=new Student();//new 一个对象
		stu.setName(name);
		stu.setAge(age);
		int i=this.setIndex(arr);
		stu.setOn(i);


		if(i==999){
			System.out.println("学生人数已经最大，不能继续添加了！");
		}else{
			arr[i]=stu;
		}
		this.print(arr);//更新信息
	}
	//返回数组里面为空的下标
	public int setIndex(Student[] arr){//判断学生数组里是否有人，如果没有则添加入此，有则选下一个空间
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){
				return i;
			}
		}
		return 9999;
	}
	//查询方法
	public void select(int on,Student[] arr){//接收编号，并且在数组里面查
		System.out.println(msg);
		for(int i=0;i<arr.length;i++){
			if(this.exist(on, arr[i])){
				System.out.println(msg);
				System.out.println(arr[i]);
				return;
			}
		}


		System.out.println("---没有这个学生存在---");
	}
	//更新信息
	public void update(int on,String name,int age,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on, arr[i])){
				arr[i].setName(name);
				arr[i].setAge(age);
				System.out.println("-----更新学生信息成功-----");
				this.print(arr);//更新信息
				return;
			}
		}
		System.out.println("没找到这个学生更新信息失败");


	}
	//删除学生方法
	public void delete(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on, arr[i])){
				arr[i]=null;
				this.print(arr);
				return;
			}
		}
		System.out.println("您所指定的编号的学生没有存在");
	}
	//输入学生成绩的操作
	public void input(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on, arr[i])){
				System.out.println("请输入"+arr[i].getName()+"的Java的成绩");
				Scanner in=new Scanner(System.in);
				if(in.hasNextInt()){//如果用户输入的是int值，就把这个值传给它
					arr[i].setJava(in.nextInt());
				}
				System.out.println("请输入"+arr[i].getName()+"的c#的成绩");
				if(in.hasNextInt()){
					arr[i].setC_shar(in.nextInt());
				}
				System.out.println("请输入"+arr[i].getName()+"的html的成绩");
				if(in.hasNextInt()){
					arr[i].setHtml(in.nextInt());
				}
				System.out.println("请输入"+arr[i].getName()+"的sql的成绩");
				if(in.hasNextInt()){
					arr[i].setSql(in.nextInt());
				}
				this.print(arr);
				break;
			}
		}
	}
	//根据某门课程进行排序
	public void courseSort(int num,Student[] arr){
		if(num==1){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null&&arr[j]!=null){
						if(arr[i].getJava()<arr[j].getJava()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		else	if(num==2){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null&&arr[j]!=null){
						if(arr[i].getC_shar()<arr[j].getC_shar()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}


		else if(num==3){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null&&arr[j]!=null){
						if(arr[i].getHtml()<arr[j].getHtml()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		if(num==1){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null&&arr[j]!=null){
						if(arr[i].getSql()<arr[j].getSql()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		this.print(arr);
	}
	//根据总分进行排序操作
	public void sumSort(Student[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null&&arr[j]!=null){
					if(arr[i].getSum()<arr[j].getSum()){
						Student t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
			}
		}
		this.print(arr);
	}

}

