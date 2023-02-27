package Ejercicios;
import java.util.Scanner;
public class Colores {
    public static void main(String[] args) {
        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
        System.out.println("│ Código │ Color │ Código │ Color │");
        System.out.println("├────────┼───────────┼────────┼────────────────┤");
        System.out.print("│ 30 │\033[30m negro \033[39;49m │");
        System.out.println(" 90 │\033[90m negro claro \033[39;49m │");
        System.out.print("│ 31 │\033[31m rojo \033[39;49m │");
        System.out.println(" 91 │\033[91m rojo claro \033[39;49m │");
        System.out.print("│ 32 │\033[32m verde \033[39;49m │");
        System.out.println(" 92 │\033[92m verde claro \033[39;49m │");
        System.out.print("│ 33 │\033[33m amarillo \033[39;49m │");
        System.out.println(" 93 │\033[93m amarillo claro \033[39;49m│");
        System.out.print("│ 34 │\033[34m azul \033[39;49m │");
        System.out.println(" 94 │\033[94m azul claro \033[39;49m │");
        System.out.print("│ 35 │\033[35m morado \033[39;49m │");
        System.out.println(" 95 │\033[95m morado claro \033[39;49m │");
        System.out.print("│ 36 │\033[36m cian \033[39;49m │");
        System.out.println(" 96 │\033[96m cian claro \033[39;49m │");
        System.out.print("│ 37 │\033[37m blanco \033[39;49m │");

        System.out.print("\033[33m ➙ ➚ ➛ ➜ ➝ ➞ ➟ ➠ ➡ ➢ ➣ ➤ ➥ ➦ ➧ ➨ ➩ ➪ ➫ ➬ ➭ ➮ ➯ ➱ ➲ ➳ ➴ ➵ ➶ ➷ ➸ ➹ ➺ ➻ ➼ ➽ ➾\n");
        System.out.print("\033[32m █ ░ ▒ ▓ ■ □ ▢ ▤ ▥ ▦ ▧ ▨ ◧ ◨ ◩ ◪ ◫ ◰ ◱ ◲ ◳ ⊞ ⊟ ⊠ ⊡\n");
        System.out.print("\033[31m ← ↑ → ↓ ↔ ↕ ↖ ↗ ↘ ↙ ↚ ↛ ↜ ↝ ↞ ↟ ↠ ↡ ↢ ↣ ↤ ↥ ↦ ↧ ↨ ↩ ↪ ↫ ↬ ↭ ↮ ↯ ↰ ↱ ↲ ↳ ↴ ↵\n");
        System.out.print("\033[37m ❶ ❷ ❸ ❹ ❺ ❻ ❼ ❽ ❾ ❿ ① ② ③ ④ ⑤ ⑥ ⑦ ⑧ ⑨ ⑩ ➊ ➋ ➌ ➍ ➎ ➏ ➐ ➑ ➒ ➓\n");
        System.out.print("\033[36m ↶ ↷ ↸ ↹ ↺ ↻ ↼ ↽ ↾ ↿ ⇀ ⇁ ⇂ ⇃ ⇄ ⇅ ⇆ ⇇ ⇈ ⇉ ⇊ ⇋ ⇌ ⇍ ⇎ ⇏ ⇐ ⇑ ⇒ ⇓ ⇔ ⇕ ⇖ ⇗ ⇘ ⇙ ⇚ ⇛\n");
        System.out.print("\033[35m ♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ \n");
        System.out.print("\033[34m ─ ━ │ ┃ ┄ ┅ ┆ ┇ ┈ ┉ ┊ ┋ ┌ ┏ ┐ ┓ └ ┗ ┘ ┛ ├ ┣ ┤ ┫ ┬ ┳ ┴ ┻ ┼ ╋ ═ ║ ╔ ╗ ╚ ╝ ╠ ╣ ╦ ╩ ╬ ╭ ╮ ╯ \n");
        System.out.println("\033[30m ⇜ ⇝ ⇞ ⇟ ⇠ ⇡ ⇢ ⇣ ⇤ ⇥ ⇦ ⇧ ⇨ ⇩ ⇪ ⇫ ⇬ ⇭ ⇮ ⇯ ⇰ ⇱ ⇲ ⇳ ⇴ ⇵ ⇶ ⇷ ⇸ ⇹ ⇺ ⇻ ⇼ ⇽ ⇾ ⇿ ➔ ➘\n");

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tres números (pueden contener decimales) separados por espacio\s: ");
        double x1 =s.nextDouble()  ;
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();
        double media = (x1 + x2 + x3) / 3;
        System.out.println("\033[36m La media de esos tres números es \033[39;49m"  + media);

    }
}
