public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerWeightFirst = 78.2;
        var boxerWeightSecond = 82.7;
        var boxerWeightSum = boxerWeightFirst + boxerWeightSecond;
        System.out.println("Общий вес двух бойцов " + boxerWeightSum + " кг");
        var boxerWeightDifference = boxerWeightSecond - boxerWeightFirst;
        System.out.println("Разница между весами бойцов " + boxerWeightDifference + " кг");
        boxerWeightDifference = boxerWeightSecond % boxerWeightFirst;
        System.out.println("Разница между весами бойцов " + boxerWeightDifference + " кг");
        var workingHoursGeneral = 640;
        var workingHoursStaffer = 8;
        var numberOfStuff = workingHoursGeneral / workingHoursStaffer;
        System.out.println("Всего работников в компании - " + numberOfStuff + " человек");
        numberOfStuff = numberOfStuff + 94;
        workingHoursGeneral = numberOfStuff * workingHoursStaffer;
        System.out.println("Если в компании работает " + numberOfStuff + " человек, то всего " + workingHoursGeneral + " часов работы может быть поделено между сотрудниками");




    }
}