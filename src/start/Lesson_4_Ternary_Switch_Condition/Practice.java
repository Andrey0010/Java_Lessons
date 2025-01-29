package start.Lesson_4_Ternary_Switch_Condition;

public class Practice {
    public static void main(String[] args) {
        //Проверить работоспособность двигателя и трансмисии - работают
        //хотя бы 3 колеса из 4х не проколоты
        //если машина работоспособна - "машина готова к экспл"
        //если машина сломана - "машина слоvана"
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;

        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = false;
        boolean isFineWheel4 = true;

        boolean isWorkEngineAndTransmission = isWorkEngine && isWorkTransmission;
        boolean a = isFineWheel1 && isFineWheel2 && isFineWheel3 && isFineWheel4;
        boolean b = isFineWheel1 && isFineWheel2 && isFineWheel3;
        boolean c = isFineWheel1 && isFineWheel2 && isFineWheel4;
        Boolean d = isFineWheel1&& isFineWheel3 && isFineWheel4;
        boolean f = isFineWheel2 && isFineWheel3 && isFineWheel4;
        boolean isWorkWheels = a && b && c && d && f;

        boolean isCarOk = isWorkEngineAndTransmission && isWorkWheels;

        if (isWorkEngine && isWorkTransmission){
            System.out.println("Двигатель и трансмиссия работают");
        }else{
            System.out.println("Двигатель и трансмиссия не работают");
        }
        if (isFineWheel1 && isFineWheel2 && isFineWheel3 && isFineWheel4);
        else if(isFineWheel1 && isFineWheel2 && isFineWheel3);
        else if (isFineWheel1 && isFineWheel2 && isFineWheel4);
        else if (isFineWheel1&& isFineWheel3 && isFineWheel4);
        else if (isFineWheel2 && isFineWheel3 && isFineWheel4){
            System.out.println("Колеса норм");
            }else{
            System.out.println("Колеса не норм");
        }
        if (isCarOk){
            System.out.println("Машина готова к эксплуатации");
        }else{
            System.out.println("Машина сломана");
        }

        }
    }

