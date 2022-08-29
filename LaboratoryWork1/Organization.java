import java.text.Collator;
import java.util.*;


public class Organization{
    String name;
    String address;
    String director;
    String number;
    ArrayList <Organization> localOrganizations = new ArrayList<>();

    Organization(String name, String address, String director, String number){
        this.name = name;
        this.address =address;
        this.director = director;
        this.number = number;

    }

    void sortEM() {
        if (!(localOrganizations.size() <= 1)) {
            int count = localOrganizations.size();

            ArrayList<Organization> copyORG = new ArrayList<>();


            String[] onlynameSorted = new String[count];


            for (int i = 0; i < count; i++) {
                onlynameSorted[i]=(localOrganizations.get(i).name);

            }


            Arrays.sort(onlynameSorted, String.CASE_INSENSITIVE_ORDER);


            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (onlynameSorted[i] == localOrganizations.get(j).name) {
                        copyORG.add(i, localOrganizations.get(j));
                    }
                }
            }



            for (int i = 0; i < count; i++) {
                localOrganizations.set(i, copyORG.get(i));
            }


        }
    }


    void showAllOrganization()  {

        if(localOrganizations.size()==0){
            System.out.println("Наразі нічого немає у базі");
        }
        Arrays.sort(new ArrayList[]{localOrganizations});
        for(int i =0;i<localOrganizations.size();i++){
            System.out.println("Організація #"+(i+1)+"|Назва: "+localOrganizations.get(i).name + "|Адреса: "+localOrganizations.get(i).address+"|Директор/СЕО: "+localOrganizations.get(i).director+"|Тел.номер: "+localOrganizations.get(i).number);
        }


    }

   void deleteOrganization(){
        Scanner in = new Scanner(System.in);
        int choose;
        int correct = 0;
       for(int i =0;i<localOrganizations.size();i++){
           System.out.println("Компанія #"+(i+1)+"    "+localOrganizations.get(i));
       }
       System.out.println("Введіть номер організації,яку бажаєте видалити:");
       do {
           while (!in.hasNextInt()) {
               System.err.println("\tСталася помилка! \nНекоректна вхідна інформація,повторіть спробу");
               in.next();
           }
           correct=1;
           choose = in.nextInt();
           if(choose <1 || choose>localOrganizations.size()){
               System.err.println("!!!ПОМИЛКА!!!Ви не можете обрати неїснуючу організацію");correct=0;}
       }while (correct==0);
       int foryou = choose-1;
       localOrganizations.remove(foryou);
       Organization[] specForSort = new Organization[localOrganizations.size()];
       for (int i =0;i<localOrganizations.size();i++){
           specForSort[i] = localOrganizations.get(i);
       }
       sortEM();
   }


    void addNewOrganization(){
        Scanner addOrg = new Scanner(System.in);


        System.out.println("Отже,ви рішили добавити нову організацію,впишіть все необхідне по черзі");
        System.out.println("Введіть назву організації:");
        this.name = addOrg.nextLine();
        System.out.println("Введіть адресу організації:");
        this.address = addOrg.nextLine();
        System.out.println("Введіть директора/СЕО організації:");
        this.director = addOrg.nextLine();
        System.out.println("Введіть телефон організації:");
        this.number = addOrg.nextLine();
        Organization organization=new Organization(name,address,director,number);
        localOrganizations.add(organization);
        if(!(localOrganizations.size() <=1)) {
            sortEM();
        }
        System.out.println();

        System.out.println("Ви успішно добавили компанію "+name+ "  Адреса:"+address+"  Директор/СЕО:"+ director+"  Тел.номер:"+number);

        System.out.println();

    }

}
