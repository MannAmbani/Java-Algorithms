package HashBasedStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashBasedAlgorithm {
    public static void main(String[] args) {
        basicAlgorithm();

        findMissingelements(new int[] { 1, 2, 3, 4 }, new int[] { 1, 3 }).forEach(System.out::println);
        System.out.println();

        findMissingelements(new int[] { 8, 0, 1, 7, 3 }, new int[] { 5, 7, 8, 0, 2 }).forEach(System.out::println);

        displayFreqOfEachElement(new int[] {4,1,2,3,1,2,5,8,6,4,5,6,2,2,1,4,1,2,3});

    }

    public static void basicAlgorithm() {
        Employee employee = new Employee("Mann", 007, "Produce");
        Employee employee2 = new Employee("Athul", 99, "Grocery");
        Employee employee3 = new Employee("Slock", 74, "Cashier");

        // each key is uique
        HashMap<Integer, Employee> employeeById = new HashMap<>();
        employeeById.put(employee.id, employee);
        employeeById.put(employee2.id, employee2);
        employeeById.put(employee3.id, employee3);

        Employee retrivedEmployee = employeeById.get(007);

        if (retrivedEmployee != null) {
            System.out.println(retrivedEmployee.name + " : " + retrivedEmployee.department);
        }

        // each data is unique
        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("ABCT3");
        productCodes.add("ABCT4");
        productCodes.add("ABCT5");
        productCodes.add("ABCT6");

        System.out.println(productCodes.contains("ABCT3"));
        System.err.println(productCodes.contains("ASDD"));
    }

    public static List<Integer> findMissingelements(int[] first, int[] second) {
        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int x : second) {
            set.add(x);
        }
        for (int x : first) {
            if (!set.contains(x)) {
                missingElements.add(x);
            }
        }

        return missingElements;

    }

    public static void displayFreqOfEachElement(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int x: arr){
            if (!freqMap.containsKey(x)) {
                freqMap.put(x, 1);
            }else{
                freqMap.put(x, freqMap.get(x)+1);
            }
        }
        freqMap.forEach((key,value) -> System.out.println(key + " : "+ value));
    }
}
