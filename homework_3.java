public class homework_3 {
        public static void main (String[] args) {
            int X = 1;
            int Y = 4;
            int Z = 1;
            int msX = (X * 3600) * 1000;
            int msY = (Y * 60) * 1000;
            int msZ = Z * 1000;
            int msAll = msX+msY+msZ;

            boolean Zok = Z < 60;
            boolean Yok = Y < 60;

            //How can i put both to be checked for true, e.g.: boolean bothOk=(Z,Y) <=0 ; ?
            boolean zOk = Y>=0;
            boolean yOk = Z>=0;
            boolean bothOk = zOk && yOk;

            System.out.println(Yok && Zok && bothOk ? "X converted to miliseconds is: "+msX+", Y equals to: "+msY+
                    ", Z is "+msZ+" and total given time converted to miliseconds is: "+msAll+"." : "Please check the data you provided");
        }
    }
