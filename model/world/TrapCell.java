package model.world;

public class TrapCell extends Cell{
    private int trapDamage;

    public TrapCell() {
        int randomGen = (int) (Math.random() * 3) + 1;
        switch(randomGen)
        {
            case 1:
                trapDamage = 10;
                break;
            case 2:
                trapDamage = 20;
                break;  
            default:
                trapDamage = 30;
                break;
        }
    }

    public int getTrapDamage() {
        return trapDamage;
    }
    
}
