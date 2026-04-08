class Client {
    String name;
    int riskScore;
    int balance;

    Client(String name, int riskScore, int balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }
}

public class Week3_4 {

    static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 &&
                    (arr[j].riskScore < key.riskScore ||
                            (arr[j].riskScore == key.riskScore &&
                                    arr[j].balance < key.balance))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void topK(Client[] arr, int k) {
        for (int i = 0; i < k && i < arr.length; i++) {
            System.out.println(arr[i].name + " " + arr[i].riskScore);
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20, 1000),
                new Client("B", 50, 2000),
                new Client("C", 80, 500)
        };

        bubbleSort(arr);
        insertionSort(arr);
        topK(arr, 3);
    }
}