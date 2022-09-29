package S1.M3.T1;/*
	Student类封装，测试equals，hashCode，toString方法
 */

public class Student extends Object{
	
	private int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(0 < id){
			this.id = id;
		}else{
			System.out.println("学号有错误！");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals (Object obj) {

		// 当调用对象和参数对象指向同一个对象时，则内容一定相同
		if(this == obj) return true;
		
		// 当调用对象为不为空而参数对象为空时，则内容一定不相同
		if(null == obj) return false;

		 // 判断obj指向的对象是否为Student类型的对象，若是则条件成立，否则条件不成立
		if(obj instanceof Student) {
			Student ts = (Student)obj;
		    // 以学号作为基准判断两个对象是否相等  int是基本数据类型，内存空间中放的就是数据本身，使用 == 可以判断数据是否相同
			//return this.getId() == ts.getId();
			//return (this.getName().equals(ts.getName())); //比较姓名字符串的内容是否相同,equals调用的是String类的equals方法
			//同时以姓名和学号为基准
			return (this.getName().equals(ts.getName()) && this.getId() == ts.getId());
		}
		//否则类型不一致
		return false;	
	}

	@Override
	public int hashCode() {
		final int type = 12;
		//return type * 31 + getId();
		return type * 31 + getName().hashCode();
	}

	@Override
	public String toString() {
		return("id = " + getId() + ",name = " + getName());
	}


}