public class Main {
    public static void main(String[] args) {
        String firstName = " Ivanov";
        String middleName = " Ivan";
        String lastName = " Ivanovich";
        String fullName = "Ivanov I. I.";
        String zamenaBukvi = "ПёС";
        System.out.println(" Ф. И. О. сотрудника — "+  firstName + middleName+ lastName );
        System.out.println(" Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase() );
        System.out.println(zamenaBukvi.replace("Ё", "Е").replace("ё", "е"));
    }
}