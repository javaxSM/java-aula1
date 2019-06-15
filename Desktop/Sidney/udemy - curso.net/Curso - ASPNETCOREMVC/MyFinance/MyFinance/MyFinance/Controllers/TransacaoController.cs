using Microsoft.AspNetCore.Mvc;

namespace MyFinance.Controllers
{
    public class TransacaoController : Controller
    {

        public IActionResult Index()
        {

            return View();
        }


        public IActionResult Extrato() // Obriga a tratar devido a CADA referência da "TRANSAÇÃO"- VIEW
        { 
            return View();
        }


        public IActionResult DashBoard()
        {
            return View();
        }
    }
}