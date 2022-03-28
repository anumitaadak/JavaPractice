public class SpringSeason {
    public static void main(String[] args) {
        int[] MmDd1 = new int[args.length];


        for (int i = 0; i < args.length; i++) {
            MmDd1[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }

        System.out.println(dayMonth(MmDd1));
    }


    public static boolean dayMonth(int... args) {
        boolean valid = true;
        boolean invalid = false;

        int MmDd1 = args[0];
        if (MmDd1 >= 320 && MmDd1 <= 630){

                System.out.println("valid");
                return valid;
            }
            else {
                System.out.println("invalid");
                return invalid;
            }


            }




    }












