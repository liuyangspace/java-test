package test.base;

public enum  ColorEnum {
    RED(1,"red"){
        @Override
        public int getAge() {
            return getIndex()*10;
        }
    },FREEN(2,"green"){
        @Override
        public int getAge() {
            return getIndex()*10;
        }
    },BLUE(3,"blue"){
        @Override
        public int getAge() {
            return getIndex()*10;
        }
    };

    private int index;
    private String title;

    private ColorEnum(int index,String title){
        this.index = index;
        this.title = title;
    }

    public int getIndex(){
        return index;
    }

    public String getTitle(){
        return title;
    }

    public abstract int getAge();
}

class ColorTest{
    public static void main(String[] args){
        ColorEnum colorEnum = ColorEnum.RED;
        System.out.println(colorEnum);
        System.out.println(colorEnum.getIndex());
        System.out.println(colorEnum.getTitle());
        System.out.println(colorEnum.getAge());
        System.out.println(colorEnum.valueOf("RED"));
    }
}