public class mergeString {
    public static void merge_sort(String strr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si-(si-ei)/2;
        merge_sort(strr,si,mid);
        merge_sort(strr,mid+1,ei);
        mergeString(strr,si,mid,ei);
    }
    public static boolean compareString(String strr[],int i,int j){
        int temp =(strr[i].compareTo(strr[j]));
        if(temp<1){
            return true;
        }else{
            return false;
        }
    }
    public static void mergeString(String strr[],int si,int mid,int ei){
        String temp[]= new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(compareString(strr, i, j)){
                temp[k]=strr[i];
                strr[i]= strr[j];
                strr[j]=temp[k];
                i++;
            }else{
                temp[k]=strr[j];
                j++;
            }k++;
        } 
        while(i<=mid){
            temp[k++]=strr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=strr[j++];
        }
        // copy to original arr
        for(k=0,i=si;k<temp.length;i++,k++){
            strr[i]= temp[k];
        }

    } 
    
    public static void main(String args[]){
        String strr[] = { "sun", "earth", "mars", "mercury" };
        int si =0;
        int ei=4;
        merge_sort(strr, si, ei);
    }
}
