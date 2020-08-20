package testcode;

/** 走台阶问题,
 * 一次走一步或者两步,走到 n 级台阶总共有几种走法
 */
public class Step {
    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.helper(6);
        System.out.println(solution.sum);

        Solution2 solution2= new Solution2();
        System.out.println(solution2.helper(6));
    }


}

class Solution{
    public int sum=0;

    /**
     * 递归的本质可能是最小单元的算子会计算几次的问题,还是一个循环,只不过会把任务进行拆解.
     * 如本题,如果 n 为 6,那么最后会拆成 4 个 f(2) 3 个 f(1),可以用递归树来进行分析
     * 本题没有按照传统的 return f(n-1)+f(n-2)的方式来写,因为感觉像下面这样写更加容易理解.
     * @param n
     */
    public void helper(int n){
        if(n==2){
            sum=sum+2;
            return;
        }if (n==1){
            sum=sum+1;
            return;
        }
        helper(n-1);
        helper(n-2);
    }
}

/**
 * 需要考虑到的是,每一层台阶的总走法,相当于是前一层+前两层的走法和
 */
class Solution2{
    public int helper(int n){
        if (n==2){
            return 2;
        }else if (n==1){
            return 1;
        }
        else {
            return helper(n-1)+helper(n-2);
        }

    }
}
