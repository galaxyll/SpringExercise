package cn.itcast.ssm.po;

public class Items {

     private   String name;
     private int price;
     private String detail;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public  String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public  String getDetail() {
        return detail;
    }
}
