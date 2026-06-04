// class Fan
// {
//     boolean power;
//     int speed;
//     void switchOn() {
//         power = true;
//         speed = 0;
//     }
//     void setSpeed(int level) {
//         speed = level;
//     }
//     void switchOff() {
//         power = false;
//     }
//     void showStatus() {
//         System.out.println("Fan power:"+power);
//         System.out.println("Fan speed:"+speed);
//     }
// }
// class TableFan extends Fan
// {
//     boolean swing;
//     public void setSwingOn()
//     {
//         swing = true;
//     }
//     public void showStatus()
//     {
//         super.showStatus();
//         System.out.println("fan swing:"+swing);
//     }
// }

// public class InheritanceExample1 {
//     public static void main(String[] args) {
//         TableFan tf = new TableFan();
//         tf.switchOn();
//         tf.setSpeed(5);
//         tf.setSwingOn();

//         tf.showStatus();
//     }
// }