package NguyenHong;

import java.util.Scanner;

public class Oppquanlisinhvien {

	private String name;
	private String mSV;
	private int tuoi;
	private float diemmon1, diemmon2, diemmon3;
	private int so1, so2, so3;
	private String lop;
	private float dtb;
	
	public Oppquanlisinhvien(String name, String mSV, int tuoi, float diemmon1, float diemmon2, float diemmon3, int so1,
			int so2, int so3, String lop, float dtb) {
		super();
		this.name = name;
		this.mSV = mSV;
		this.tuoi = tuoi;
		this.diemmon1 = diemmon1;
		this.diemmon2 = diemmon2;
		this.diemmon3 = diemmon3;
		this.so1 = so1;
		this.so2 = so2;
		this.so3 = so3;
		this.lop = lop;
		this.dtb = dtb;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getmSV() {
		return mSV;
	}


	public void setmSV(String mSV) {
		this.mSV = mSV;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public float getDiemmon1() {
		return diemmon1;
	}


	public void setDiemmon1(float diemmon1) {
		this.diemmon1 = diemmon1;
	}


	public float getDiemmon2() {
		return diemmon2;
	}


	public void setDiemmon2(float diemmon2) {
		this.diemmon2 = diemmon2;
	}


	public float getDiemmon3() {
		return diemmon3;
	}


	public void setDiemmon3(float diemmon3) {
		this.diemmon3 = diemmon3;
	}


	public int getSo1() {
		return so1;
	}


	public void setSo1(int so1) {
		this.so1 = so1;
	}


	public int getSo2() {
		return so2;
	}


	public void setSo2(int so2) {
		this.so2 = so2;
	}


	public int getSo3() {
		return so3;
	}


	public void setSo3(int so3) {
		this.so3 = so3;
	}


	public String getLop() {
		return lop;
	}


	public void setLop(String lop) {
		this.lop = lop;
	}


	public float getDtb() {
		return dtb;
	}


	public void setDtb(float dtb) {
		this.dtb = dtb;
	}


	public Oppquanlisinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten sinh vien: ");
		name = sc.nextLine();
		System.out.println("Nhap ma sinh vien: ");
		mSV = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi =sc.nextInt();
		System.out.println("Nhap diem mon 1 2 3: ");
		diemmon1 = sc.nextFloat();
		diemmon2 = sc.nextFloat();
		diemmon3 = sc.nextFloat();
		System.out.println("Nhap so tin chi tuong ung mon 1 2 3: ");
		so1 = sc.nextInt();
		so2 = sc.nextInt();
		so3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten lop: ");
		lop = sc.nextLine();
	}
	public void display() {
		System.out.println("Ho ten: " +name);
		System.out.println("Ma sinh vien: "+mSV);
		System.out.println("Tuoi: "+tuoi);
		System.out.println("Diem mon 1: "+diemmon1);
		System.out.println("So tin chi mon 1: "+so1);
		System.out.println("Diem mon 2: "+diemmon2);
		System.out.println("So tin chi mon 2: "+so2);
		System.out.println("Diem mon 3: "+diemmon3);
		System.out.println("So tin chi mon 3: "+so3);
		dtb = (float)(diemmon1*so1+diemmon2*so2+diemmon3*so3)/(so1+so2+so3);
		System.out.println("DTB : " +dtb);
		if(dtb>=4 && dtb<6) System.out.println("Xep loai : Trung binh");
		if(dtb<4)  System.out.println("Xep loai : Yeu");
		if(dtb>=6 && dtb<8) System.out.println("Xep loai : Kha");
		if(dtb>=8) System.out.println("Xep loai : Gioi");
		
	}
	
}
