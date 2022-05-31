public class Morris {
    public void MorrisTravel(TNode root){
        TNode cur=root;
        TNode mostRight=null;
        while (cur!=null){
            System.out.println(cur.aChar);
            if (cur.lchild==null) cur=cur.rchild;
            else {
                mostRight=cur.lchild;
                while (mostRight.rchild!=cur&&mostRight.rchild!=null) mostRight=mostRight.rchild;
                if (mostRight.rchild==null){
                    mostRight.rchild=cur;
                    cur=cur.lchild;
                }else {
                    mostRight.rchild=null;
                    cur=cur.rchild;
                }
            }
        }

    }
    public void MorrisTravelPre(TNode root){
        TNode cur=root;
        TNode mostRight=null;
        while (cur!=null){
            if (cur.lchild==null) {
                System.out.println(cur.aChar);
                cur=cur.rchild;}
            else {
                mostRight=cur.lchild;
                while (mostRight.rchild!=cur&&mostRight.rchild!=null) mostRight=mostRight.rchild;
                if (mostRight.rchild==null){
                    System.out.println(cur.aChar);
                    mostRight.rchild=cur;
                    cur=cur.lchild;
                }else {
                    mostRight.rchild=null;
                    cur=cur.rchild;
                }
            }
        }
    }
    public void MorrisTravelIn(TNode root){
        TNode cur=root;
        TNode mostRight=null;
        while (cur!=null){
            if (cur.lchild==null) {
                System.out.println(cur.aChar);
                cur=cur.rchild;}
            else {
                mostRight=cur.lchild;
                while (mostRight.rchild!=cur&&mostRight.rchild!=null) mostRight=mostRight.rchild;
                if (mostRight.rchild==null){
                    mostRight.rchild=cur;
                    cur=cur.lchild;
                }else {
                    System.out.println(cur.aChar);
                    mostRight.rchild=null;
                    cur=cur.rchild;
                }
            }
        }
    }
    public void MorrisTravelPost(TNode root){
        TNode cur=root;
        TNode mostRight=null;
        while (cur!=null){
            if (cur.lchild==null) {
                cur=cur.rchild;}
            else {
                mostRight=cur.lchild;
                while (mostRight.rchild!=cur&&mostRight.rchild!=null) mostRight=mostRight.rchild;
                if (mostRight.rchild==null){
                    mostRight.rchild=cur;
                    cur=cur.lchild;
                }else {
                    mostRight.rchild=null;
                    TNode q=reverseNode(cur.lchild);
                    TNode p=q;
                    while (p!=null){
                        System.out.println(p.aChar);
                        p=p.rchild;
                    }
                    reverseNode(q);
                    cur=cur.rchild;
                }
            }
        }
        TNode q=reverseNode(root);
        TNode p=q;
        while (p!=null){
            System.out.println(p.aChar);
            p=p.rchild;
        }
        reverseNode(q);
    }
    public TNode reverseNode(TNode from){
        TNode pre=null;
        TNode next=null;
        while (from!=null){
            next=from.rchild;
            from.rchild=pre;
            pre=from;
            from=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        TNode R=new TNode();
        TNode A=new TNode();
        TNode B=new TNode();
        TNode C=new TNode();
        TNode D=new TNode();
        R.aChar='R';
        A.aChar='A';
        B.aChar='B';
        C.aChar='C';
        D.aChar='D';
        R.lchild=A;
        R.rchild=B;
        A.lchild=C;
        A.rchild=D;
        Morris morris=new Morris();
        morris.MorrisTravelPost(R);

    }
}
class TNode{
    char aChar;
    TNode lchild;
    TNode rchild;
}
