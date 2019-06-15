using Microsoft.AspNetCore.Http;
using MyFinance.Util;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;

namespace MyFinance.Models
{
    public class PlanoContasModel
    {

        public int Id { get; set; }
        [Required(ErrorMessage = "Descrição necessária")]
        public string Descricao { get; set; }
        public string tipo { get; set; }
        public int Usuario_Id { get; set; }

        public IHttpContextAccessor HttpContextAccessor { get; set; }

        public PlanoContasModel(IHttpContextAccessor httpContextAccessor)
        {
            HttpContextAccessor = httpContextAccessor;
        }

        public PlanoContasModel()
        {
            
        }

        public List<PlanoContasModel> ListaPlano()
        {

            List<PlanoContasModel> Lista = new List<PlanoContasModel>();
            PlanoContasModel item;

            string IdUsuarioLogado = HttpContextAccessor.HttpContext.Session.GetString("IdUsuarioLogado");
            string sql = $"SELECT ID, DESCRICAO, TIPO, USUARIO_ID FROM PLANO_CONTAS WHERE USUARIO_ID = {IdUsuarioLogado}";
            DAL objDal = new DAL();
            DataTable dt = objDal.RetDataTable(sql);
            

            for(int i=0; i < dt.Rows.Count; i++)
            {
                item = new PlanoContasModel();
                item.Id = int.Parse(dt.Rows[i]["ID"].ToString());
                item.Descricao = dt.Rows[i]["DESCRICAO"].ToString();
                item.tipo = dt.Rows[i]["TIPO"].ToString();
                item.Usuario_Id = int.Parse(dt.Rows[i]["USUARIO_ID"].ToString());
                Lista.Add(item);
            }

            return Lista;
        }

        public PlanoContasModel CarregarRegistro(int? id)
        {
            PlanoContasModel item = new PlanoContasModel();

            string IdUsuarioLogado = HttpContextAccessor.HttpContext.Session.GetString("IdUsuarioLogado");
            string sql = $"SELECT ID, DESCRICAO, TIPO, USUARIO_ID FROM PLANO_CONTAS WHERE USUARIO_ID = {IdUsuarioLogado} AND ID = {id}";
            DAL objDal = new DAL();
            DataTable dt = objDal.RetDataTable(sql);

            item.Id = int.Parse(dt.Rows[0]["ID"].ToString());
            item.Descricao = dt.Rows[0]["DESCRICAO"].ToString();
            item.tipo = dt.Rows[0]["TIPO"].ToString();
            item.Usuario_Id = int.Parse(dt.Rows[0]["USUARIO_ID"].ToString());

            return item;
        }

        public void Insert()
        {
            string IdUsuarioLogado = HttpContextAccessor.HttpContext.Session.GetString("IdUsuarioLogado");
            string sql = "";

            if (Id == 0)
            {
               sql = $"INSERT INTO PLANO_CONTAS (DESCRICAO, TIPO, USUARIO_ID) VALUES ('{Descricao}', '{tipo}', '{IdUsuarioLogado}')";
            }
            else
            {
                sql = $"UPDATE PLANO_CONTAS SET DESCRICAO = '{Descricao}', TIPO = '{tipo}' WHERE USUARIO_ID = '{IdUsuarioLogado}' AND ID = {Id}";
            }
            DAL objDAL = new DAL();  // Objeto da classe de acesso a dados (SQL).
            objDAL.ExecutaComandoSQL(sql);
        }

        public void Excluir(int id_conta)
        {
            new DAL().ExecutaComandoSQL("DELETE FROM PLANO_CONTAS WHERE ID = " + id_conta);
        }

      
    }
}
