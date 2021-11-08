# Arena Battle - Monster vs Human

### Első feladat - Osztályok létrehozása (src.main.java.hu.progmasters.arena)
1. Hozz létre egy Human osztályt! Legyen neki egy name (String) és egy life (int) attribútuma! A konstruktor csak a nevet kérje be paraméterként! Legyen két getter, viszont settert csak a life-hoz hozz létre!
2. Hozz létre egy Monster osztályt! Legyen neki egy name (String), egy life (int) és egy specialAttack (final int) attribútuma! A konstruktor csak a nevet kérje be paraméterként, viszont a specialAttack értékének állítson be véletlenszerűen* egy számot 3-5-ig! Legyen három getter, viszont settert csak a life-hoz hozz létre!
3. Hozz létre egy Arena osztályt! Legyen neki egy human (Human) és egy monster (Monster) attribútuma! Egy üres konstruktorra van csak szükség, és két setterre.

### Második feladat - Let's battle!
Hozz létre az Arena osztályban egy letsBattle() metódust, ami tartalmazza a harc logikáját! A konzolra kell kiírnia a különböző körök eredményét. Erre találsz egy példát az EXAMPLE.txt fájlban. Így nézzen ki egy lefuttatott harc!
Mi történik?
- Legyenek körök a harc során! Számoljuk is, hogy hányadik körnél tartunk!
- A metódusban fusson egy logika addig, amíg vagy az ember, vagy a szörny vagy mindkettő életereje nulla vagy az alá csökken!
- Minden körben random* generálunk egy számot 0-10-ig a szörnynek. Ez lesz az ő sebzése. Ezt le kell vonni az ember életerejéből.
- Minden körben random* generálunk egy számot 0-10-ig az embernek. Ez lesz az ő sebzése. Ezt le kell vonni az szörny életerejéből.
- A szörnynek van egy speciális támadás értéke. (3, 4 vagy 5). Minden körben vizsgáld meg, hogy az adott kör sorszáma osztható-e maradékosan a speciális támadás értékével. Amennyiben igen, a szörny sebez még egyet az emberen. Látható, hogy a hármassal rendelkező szörny a legerősebb, hiszen ő minden harmadik körben tud plusz egyet sebezni.
- Minden kör végén mond meg a programnak, hogy várjon 1-3 másodpercet*, hogy szépen szemmel követhető legyen a játék menete!
- Amikor ez a harc logika véget ér, írd ki, hogy melyikük nyert! Nagy ritkán egyszerre mérik egymásra a halálos csapást, ezt is vedd figyelembe!

### Harmadik feladat - Játék indítása
Hozz létre egy ArenaGame osztályt, amely csak egy main metódust tartalmaz! Példányosíts egy Arena objektumot, majd egy Humant és egy Monstert is! Utóbbi kettőt "küld be" az arénába! Ezek után nincs más hátra, mint meghívni az aréna példány letsBattle() metódusát, és nézni a küzdelmet.

Te kinek szurkolsz? :)

### Kiegészítés*
Véletlen szám generálása:<br />
Random random = new Random(); // Létrehoztunk egy objektumot a Random osztályból.<br />
int x = random.nextInt(5); // Ez 0-4-ig hoz létre egy random számot.<br />
int y = random.nextInt(5) + 1; // Ez 1-5-ig hoz létre egy random számot.<br />

Program altatása:<br />
TimeUnit.SECONDS.sleep(3);