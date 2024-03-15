
    class MyName
    {
    private final String fname;
    private final String mname;
    private final String lname;
    private MyName(MyNestName ref)
    {
    this.fname=ref.fname;
    this.mname=ref.mname;
    this.lname=ref.lname;
    }
    public String toString()
    {
    return "My name is :- "+this.fname+" "+this.mname+" "+this.lname+"." ;
    }
    public static class MyNestName
    {
    private final String fname;
    private String mname;
    private String lname;
    public MyNestName(String fname) {
    this.fname=fname; }
    public MyNestName mname(String mname) {
    this.mname=mname;
    return this; }


    public MyNestName lname(String lname) {
    this.lname=lname;
    return this;}
    public MyName build(){
    MyName mn=new MyName(this);
    return mn;}}}
    class BuilderDemo{
    public static void main(String shruti[]){
    MyName n1=new MyName.MyNestName("pal").build();
    System.out.println(n1);
    MyName n2=new MyName.MyNestName("prashant").mname("wdcj").build();
    System.out.println(n2);
    MyName n3=new MyName.MyNestName("xjkqa").mname("qxsnk").lname
    
    ("Gandhi").build();
    System.out.println(n3); }
}
