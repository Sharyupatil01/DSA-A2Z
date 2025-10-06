package Array.Medium;

public class MajorityElement {
    //Approach first using hashMap
    public void findMajorityElement() {
        // int arr[] = {1, 1, 2, 2, 2, 1, 1, 1, 1, 1};
        // Map<Integer, Integer> hash = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        //     hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        //     if (hash.get(arr[i]) > arr.length / 2) {
        //         System.out.println("Majority Element is :" + arr[i]);
        //     }
        // }
        // for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
        //     if (entry.getValue() > arr.length / 2) {
        //         System.out.println("Majority Element is :" + entry.getKey());
        //     }
        // }

        //APPORCH 2 
        int arr[]={1, 1, 2, 2, 2, 1, 1, 1, 1, 1};
        int count=1;
        int me=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(me==arr[i])
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
            {
                me=arr[i];
                count=1;
            }
        }
        System.out.println("Majority Element is : "+me);
    }
    public static void main(String args[]){
        MajorityElement obj=new MajorityElement();
        obj.findMajorityElement();

    }

}

