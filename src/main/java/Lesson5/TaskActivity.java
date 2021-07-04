package Lesson5;

public class TaskActivity {

    public static void main(String[] args){
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ардаков Игорь Герасимович", "врач-оториноларинголог", "igorardakov@gmail.com"
                , "892312312",65000,45);
        empCorp[1] = new Employee("Донченко Иван Андреевич", "врач-кардиолог", "ivandochkov@gmail.com"
                , "892312314",60000,32);
        empCorp[2] = new Employee("Кулагина Юлия Анатольевна", "врач-кардиолог", "Youlika@gmail.com"
                , "892312315",65000,43);
        empCorp[3] = new Employee("Бирюков Евгений Евгеньевич", "врач-методист", "Evgenyy@gmail.com"
                , "892312316",55000,18);
        empCorp[4] = new Employee("Васильев Валерий Валентинович", "врач-хирург", "valery@gmail.com"
                , "892312317",50000,41);


        for (Employee employee : empCorp)
            if (employee.getAge()>40) {
                System.out.println(employee + "\n");

            }

    }
}
