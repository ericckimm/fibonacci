public fibonacci{
    public static void main(String args[])
    {
        int[]nums = new int[20];
        nums[0]=0;
        nums[1]=1;
        for(int i=2;i<20;i++)
        {
            nums[i]=nums[i-2]+nums[i-1];
        }
        //counting
        for(int i = 0;i<20;i++)
        {
            System.out.println(nums[i]);
        }
    }
}