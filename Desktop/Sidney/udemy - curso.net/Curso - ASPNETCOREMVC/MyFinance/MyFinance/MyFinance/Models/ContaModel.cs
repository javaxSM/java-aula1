using Microsoft.AspNetCore.Http;
using MyFinance.Util;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;
using System.Linq;
using System.Threading.Tasks;

namespace MyFinance.Models
{
    public class ContaModel
    {
        public int Id { get; set; }
        [Required(ErrorMessage = "Informe sua Conta")]
        public string NomeConta { get; set; }

        [Required(ErrorMessage = "Informe sua Conta")]
        public double Saldo { get; set; }
        public int Usuario_Id { get; set; }

        public IHttpContextAccessor HttpContextAccessor { get; set; }

        public ContaModel()
        {

        }

        //Recebe o contexto para acesso ás variáveis de sessão.
        public ContaModel(IHttpContextAccessor httpContextAccessor)
        {
            HttpContextAccessor = httpContextAccessor;
        }


        public List<ContaModel> ListaConta()
        {
            List<ContaModel> Lista = new List<ContaModel>();

            ContaModel item;

            string IdUsuarioLogado = HttpContextAccessor.HttpContext.Session.GetString("IdUsuarioLogado");
            string sql = $"SELECT ID, NOMECONTA, SALDO, USUARIO_ID FROM CONTA WHERE Usuario_Id = {IdUsuarioLogado}";
            DAL objDAL = new DAL();
            DataTable dt = objDAL.RetDataTable(sql);


            for (int i = 0; i < dt.Rows.Count; i++)
            {
                item = new ContaModel();
                item.Id = int.Parse(dt.Rows[i]["ID"].ToString());
                item.NomeConta = dt.Rows[i]["NOMECONTA"].ToString();
                item.Saldo = double.Parse(dt.Rows[i]["SALDO"].ToString());
                Lista.Add(item);
            }
            return Lista;
        }

        public void Insert()
        {
            string IdUsuarioLogado = HttpContextAccessor.HttpContext.Session.GetString("IdUsuarioLogado");
            string sql = $"INSERT INTO CONTA (NOMECONTA, SALDO, USUARIO_ID) VALUES ('{NomeConta}', '{Saldo}', '{IdUsuarioLogado}')";
            DAL objDAL = new DAL(); // Objeto da classe de acesso a dados (SQL).
            objDAL.ExecutaComandoSQL(sql);
        }

        public void Excluir(int id_conta)
        {
            new DAL().ExecutaComandoSQL("DELETE FROM CONTA WHERE ID = " + id_conta);
        }
    }
}