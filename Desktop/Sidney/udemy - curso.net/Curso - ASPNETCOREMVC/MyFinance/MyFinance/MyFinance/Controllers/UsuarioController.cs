using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using MyFinance.Models;


namespace MyFinance.Controllers
{
    public class UsuarioController : Controller
    {
        [HttpGet]
        public IActionResult Login(int? id)
        {
            if (id != null)
            {
                if (id == 0)
                {
                    HttpContext.Session.SetString("IdUsuarioLogado", string.Empty);
                    HttpContext.Session.SetString("NomeUsuarioLogado", string.Empty);
                }
            }

            return View();
        }

        public IActionResult ValidarLogin(UsuarioModel usuario)
        {

            bool login = usuario.ValidarLogin();
            if (login)

            {
                HttpContext.Session.SetString("NomeUsuarioLogado", usuario.Nome);
                HttpContext.Session.SetString("IdUsuarioLogado", usuario.Id.ToString());
                return RedirectToAction("Menu", "home");
            }

            else
            {
                TempData["MensagemLoginInvalido"] = "Dados de login invalidos";
                return RedirectToAction("login");

            }
        }


        [HttpPost] 
        public IActionResult Registrar(UsuarioModel usuario)
        {
            if (ModelState.IsValid)
            {
                usuario.RegistrarUsuario();
                return RedirectToAction("sucesso");
            }

            return View();
        }

        [HttpGet]
        public ActionResult Registrar()
        {
            return View();
        }

        public IActionResult sucesso()
        {

            return View();
        }
    }
}