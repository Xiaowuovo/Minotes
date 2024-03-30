import java.util.Scanner;

public class SetWithColor {
    // ANSI转义码
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        // 创建Scanner对象用于接收用户输入
        Scanner scanner = new Scanner(System.in);
        
        // 提示用户输入小时
        System.out.print("请输入小时（0-23）：");
        int hours = scanner.nextInt();
        
        // 提示用户输入分钟
        System.out.print("请输入分钟（0-59）：");
        int minutes = scanner.nextInt();
        
        // 提示用户输入秒钟
        System.out.print("请输入秒钟（0-59）：");
        int seconds = scanner.nextInt();
        
        // 提示用户选择颜色
        System.out.println("请选择文本颜色：");
        System.out.println("1. 红色");
        System.out.println("2. 绿色");
        System.out.println("3. 蓝色");
        System.out.print("请选择（输入数字）：");
        int colorChoice = scanner.nextInt();
        
        // 根据用户选择的颜色应用ANSI转义码
        String colorCode = "";
        switch (colorChoice) {
            case 1:
                colorCode = ANSI_RED;
                break;
            case 2:
                colorCode = ANSI_GREEN;
                break;
            case 3:
                colorCode = ANSI_BLUE;
                break;
            default:
                colorCode = ANSI_RESET;
                break;
        }
        
        // 设置并显示时间
        set(hours, minutes, seconds, colorCode);
        
        // 关闭Scanner对象
        scanner.close();
    }
    
    // 设置并显示时间的方法
    public static void set(int hours, int minutes, int seconds, String colorCode) {
        // 应用文本颜色
        System.out.print(colorCode);
        
        // 显示设置的时间
        System.out.println("设置的时间为：" + hours + "小时 " + minutes + "分钟 " + seconds + "秒钟");
        
        // 恢复文本颜色为默认值
        System.out.print(ANSI_RESET);
    }
}
