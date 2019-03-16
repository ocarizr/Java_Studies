package Lesson_02.Entities;

import java.util.Date;

public class Data {
    public int codigo;
    public Date dataHoraInclusao;
    public Date dataHoraEdicao;

    public Data(int codigo, Date dataHoraInclusao, Date dataHoraEdicao){
        this.codigo = codigo;
        this.dataHoraInclusao = dataHoraInclusao;
        this.dataHoraEdicao = dataHoraEdicao;
    }

    @Override
    public boolean equals(Object obj) {
        int iObj = Integer.parseInt(obj.toString());
        return iObj == codigo;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
