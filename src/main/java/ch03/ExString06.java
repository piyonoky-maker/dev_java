package ch03;

public class ExString06 {
    public static void main(String[] args) {
        /*String sql = "SELECT EMP.EMPNO, EMP.ENAME, DEPT.DNAME";
        sql += " FROM EMP, DEPT";
        sql += "WHERE EMP.DEPTNO = DEPT.DEPTNO";
        sql += "AND DEPT.DEPTNO IN (10, 30, 40)";*/

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT EMP.EMPNO, EMP.ENAME, DEPT.DNAME ");
        sb.append(" FROM EMP, DEPT ");
        sb.append(" WHERE EMP.DEPTNO = DEPT.DEPTNO ");
        sb.append(" AND DEPT.DEPTNO IN (10, 30, 40) ");
        System.out.println(sb.toString());

    }
}
