Expressões Regulares<a name="TOP"></a>
===================
- - - - 
# Validação de Login e Senha com Expressões Regulares #

Para validar um login que possua tamanho entre 5 e 30 caracteres e que contenha letras, números e caracteres especiais, usamos a seguinte expressão regular:

^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{5,30}$

Para validar uma senha que possua tamanho entre 8 e 12 caracteres, contenha letras, números, caracteres especiais, pelo menos uma letra maiúscula, um número e um caractere especial, podemos usar a seguinte expressão regular:

^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,12}$

Aplicação utilizando C#:


    using System;
    using System.Text.RegularExpressions;

    class Program
    {
        static void Main()
        {
            string login = "user!123";
            string password = "Password1!";
    
            Console.WriteLine("Login válido: " + ValidateLogin(login)); // Output: Login válido: True
            Console.WriteLine("Senha válida: " + ValidatePassword(password)); // Output: Senha válida: True
        }
    
        static bool ValidateLogin(string login)
        {
            string loginPattern = @"^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{5,30}$";
            return Regex.IsMatch(login, loginPattern);
        }
    
        static bool ValidatePassword(string password)
        {
            string passwordPattern = @"^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,12}$";
            return Regex.IsMatch(password, passwordPattern);
        }
    }
