package lca05;
/*
parent class hillstations with methods
locations
famous_for

take 3 hillstations

override above 2 methods

 */
public abstract class hillstations {
    public abstract void location();
    public abstract void famousfor();
}

class Lonavla extends hillstations{
    @Override
    public void location() {
        System.out.println("Lonavla is in Pune District");
    }

    @Override
    public void famousfor() {
        System.out.println("It is famous for Wax museum");
    }
}

class Mahabaleshwar extends hillstations{
    @Override
    public void location() {
        System.out.println("Mahabaleshwar is in Satara District");
    }

    @Override
    public void famousfor() {
        System.out.println("It is famous for Mapro Garden");
    }
}

class Matheran  extends hillstations{
    @Override
    public void location() {
        System.out.println("Matheran is in Raigad District");
    }

    @Override
    public void famousfor() {
        System.out.println("It is famous for its Weather");
    }
}