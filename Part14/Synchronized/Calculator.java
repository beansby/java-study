package Part14.Synchronized;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    /**
     * 동기화 메소드
     * @param memory
     */
    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getName()+" : "+this.memory);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" : "+this.memory);
        }
    }

    /**
     * 동기화 블록
     * @param memory
     */
    public void setMemory2(int memory) {
        synchronized (this){
            this.memory = memory;
            try {
                Thread.sleep(2000);
//                System.out.println(Thread.currentThread().getName()+" : "+this.memory);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" : "+this.memory);
            }
        }
    }
}
