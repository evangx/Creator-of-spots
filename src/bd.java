import javax.swing.*;
public class bd{
String direccion;
ImageIcon regresa;
String  []c=new String[2];

public ImageIcon getMonster(int a, int b){
direccion="/imagenes/";
switch (a){
case 1:
direccion+="atlans/";
switch (b){
case 1:
direccion+="monster_atlans_bahamut.jpg";
break;
case 2:
direccion+="monster_atlans_vepar.jpg";
break;
case 3:
direccion+="monster_atlans_valkyrie.jpg";
break;
case 4:
direccion+="monster_atlans_greatbah.jpg";
break;
case 5:
direccion+="monster_atlans_silverval.jpg";
break;
case 6:
direccion+="monster_atlans_lizard.jpg";
break;
case 7:
direccion+="monster_atlans_hydra.jpg";
break;
}
break;
case 2:
direccion+="dev/";
switch(b){
case 1:
direccion+="monster_devias_worm.jpg";
break;
case 2:
direccion+="monster_devias_icemon.jpg";
break;
case 3:
direccion+="monster_devias_hommerd.jpg";
break;
case 4:
direccion+="monster_devias_assassin.jpg";
break;
case 5:
direccion+="monster_devias_yeti.jpg";
break;
case 6:
direccion+="monster_devias_eliteyeti.jpg";
break;
case 7:
direccion+="monster_devias_icequeen.jpg";
break;
}
break;
case 3:
direccion+="dungeon/";
switch (b){
case 1:
direccion+="monster_lorencia_skeleton.jpg";
break;
case 2:
direccion+="monster_dungeon_larva.jpg";
break;
case 3:
direccion+="monster_dungeon_cyclops.jpg";
break;
case 4:
direccion+="monster_dungeon_ghost.jpg";
break;
case 5:
direccion+="monster_dungeon_archer.jpg";
break;
case 6:
direccion+="monster_dungeon_hellhound.jpg";
break;
case 7:
direccion+="monster_dungeon_hellspi.jpg";
break;
case 8:
direccion+="monster_dungeon_eliteskel.jpg";
break;
case 9:
direccion+="monster_dungeon_thunderli.jpg";
break;
case 10:
direccion+="monster_dungeon_poisonb.jpg";
break;
case 11:
direccion+="monster_dungeon_darkkni.jpg";
break;
case 12:
direccion+="monster_dungeon_gorgon.jpg";
break;
}
break;
case 4:
direccion+="icarus/";
switch(b){
case 1:
direccion+="monster_icarus_alquamos.jpg";
break;
case 2:
direccion+="monster_icarus_megacrust.jpg";
break;
case 3:
direccion+="monster_icarus_queen.jpg";
break;
case 4:
direccion+="monster_icarus_drakan.jpg";
break;
case 5:
direccion+="monster_icarus_alpha.jpg";
break;
case 6:
direccion+="monster_icarus_phantom.jpg";
break;
case 7:
direccion+="monster_icarus_greatdrak.jpg";
break;
case 8:
direccion+="monster_icarus_phoenix.jpg";
break;
}
break;
case 5:
direccion+="lor/";
switch (b){
case 1:
direccion+="monster_lorencia_spider.jpg";
break;
case 2:
direccion+="monster_lorencia_budgedrago.jpg";
break;
case 3:
direccion+="monster_lorencia_bullfight.jpg";
break;
case 4:
direccion+="monster_lorencia_hound.jpg";
break;
case 5:
direccion+="monster_lorencia_elitebull.jpg";
break;
case 6:
direccion+="monster_lorencia_lich.jpg";
break;
case 7:
direccion+="monster_lorencia_skeleton.jpg";
break;
case 8:
direccion+="monster_lorencia_giant.jpg";
break;
}
break;
case 6:
direccion+="lt/";
switch (b){
case 1:
direccion+="monster_losttower_shadow.jpg";
break;
case 2:
direccion+="monster_losttower_poisonsha.jpg";
break;
case 3:
direccion+="monster_losttower_cursedwiz.jpg";
break;
case 4:
direccion+="monster_losttower_deathcow.jpg";
break;
case 5:
direccion+="monster_losttower_devil.jpg";
break;
case 6:
direccion+="monster_losttower_deathkni.jpg";
break;
case 7:
direccion+="monster_losttower_deathgor.jpg";
break;
case 8:
direccion+="monster_losttower_balrog.jpg";
break;
}
break;
case 7:
direccion+="nor/";
switch (b){
case 1:
direccion+="monster_noria_goblin.jpg";
break;
case 2:
direccion+="monster_noria_chainscor.jpg";
break;
case 3:
direccion+="monster_noria_elitegob.jpg";
break;
case 4:
direccion+="monster_noria_beetle.jpg";
break;
case 5:
direccion+="monster_noria_hunter.jpg";
break;
case 6:
direccion+="monster_noria_forest.jpg";
break;
case 7:
direccion+="monster_noria_agon.jpg";
break;
case 8:
direccion+="monster_noria_stone.jpg";
break;
}
break;
case 8:
direccion+="tarkan/";
switch (b){
case 1:
direccion+="monster_tarkan_mutant.jpg";
break;
case 2:
direccion+="monster_tarkan_bloodywo.jpg";
break;
case 3:
direccion+="monster_tarkan_ironwheel.jpg";
break;
case 4:
direccion+="monster_tarkan_tantalos.jpg";
break;
case 5:
direccion+="monster_tarkan_beamkni.jpg";
break;
case 6:
direccion+="monster_tarkan_zaikan.jpg";
break;
case 7:
direccion+="monster_tarkan_deathbeam.jpg";
break;
}
break;
}
if(a ==0 | b==0){
direccion="imagenes/default.jpg";
}
System.out.println(direccion);
regresa=new ImageIcon(getClass().getResource(direccion)); 
//regresa=new ImageIcon(creador_de_spots.class.getResource(direccion));
return regresa;
}

public String[] getCode(int a, int b){
switch (a){
case 1:
switch (b){
case 1:
c[0]="45";
c[1]="bahamut";
break;
case 2:
c[0]="46";
c[1]="vepar";
break;
case 3:
c[0]="47";
c[1]="valkyrie";
break;
case 4:
c[0]="51";
c[1]="great bahamut";
break;
case 5:
c[0]="52";
c[1]="silver Valkyrie";
break;
case 6:
c[0]="48";
c[1]="lizard king";
break;
case 7:
c[0]="49";
c[1]="hydra";
break;
}
break;
case 2:
switch(b){
case 1:
c[0]="24";
c[1]="worm";
break;
case 2:
c[0]="22";
c[1]="ice monster";
break;
case 3:
c[0]="23";
c[1]="mercenary";
break;
case 4:
c[0]="21";
c[1]="assassin";
break;
case 5:
c[0]="19";
c[1]="yeti";
break;
case 6:
c[0]="20";
c[1]="elite yeti";
break;
case 7:
c[0]="25";
c[1]="ice queen";
break;
}
break;
case 3:
switch (b){
case 1:
c[0]="7";
c[1]="skeleton";
break;
case 2:
c[0]="12";
c[1]="larva";
break;
case 3:
c[0]="17";
c[1]="cyclops";
break;
case 4:
c[0]="11";
c[1]="gosth";
break;
case 5:
c[0]="15";
c[1]="skeleton archer";
break;
case 6:
c[0]="5";
c[1]="hell hound";
break;
case 7:
c[0]="13";
c[1]="hell spider";
break;
case 8:
c[0]="16";
c[1]="elite skeleton";
break;
case 9:
c[0]="9";
c[1]="thunder lich";
break;
case 10:
c[0]="8";
c[1]="poison bull";
break;
case 11:
c[0]="10";
c[1]="dark knigth";
break;
case 12:
c[0]="18";
c[1]="gorgon";
break;
}
break;
case 4:
switch(b){
case 1:
c[0]="69";
c[1]="alquamos";
break;
case 2:
c[0]="71";
c[1]="mega crust";
break;
case 3:
c[0]="70";
c[1]="icarus queen";
break;
case 4:
c[0]="73";
c[1]="darkan";
break;
case 5:
c[0]="74";
c[1]="alpha crust";
break;
case 6:
c[0]="72";
c[1]="phantom";
break;
case 7:
c[0]="75";
c[1]="great darkan";
break;
case 8:
c[0]="77";
c[1]="phoemix";
break;
}
break;
case 5:
switch (b){
case 1:
c[0]="3";
c[1]="spider";
break;
case 2:
c[0]="2";
c[1]="budge dragon";
break;
case 3:
c[0]="0";
c[1]="bull figther";
break;
case 4:
c[0]="1";
c[1]="hound";
break;
case 5:
c[0]="4";
c[1]="elite bull";
break;
case 6:
c[0]="6";
c[1]="lich";
break;
case 7:
c[0]="7";
c[1]="skeleton";
break;
case 8:
c[0]="14";
c[1]="gigant";
break;
}
break;
case 6:
switch (b){
case 1:
c[0]="36";
c[1]="shadow";
break;
case 2:
c[0]="39";
c[1]="posin shadow";
break;
case 3:
c[0]="34";
c[1]="cursed wizard";
break;
case 4:
c[0]="41";
c[1]="death cow";
break;
case 5:
c[0]="37";
c[1]="devil";
break;
case 6:
c[0]="40";
c[1]="death knigth";
break;
case 7:
c[0]="35";
c[1]="death gorgon";
break;
case 8:
c[0]="38";
c[1]="balrog";
break;
}
break;
case 7:
switch (b){
case 1:
c[0]="26";
c[1]="goblin";
break;
case 2:
c[0]="27";
c[1]="scorpion";
break;
case 3:
c[0]="33";
c[1]="elite goblin";
break;
case 4:
c[0]="28";
c[1]="beeatle moster";
break;
case 5:
c[0]="29";
c[1]="hunter";
break;
case 6:
c[0]="30";
c[1]="forest monster";
break;
case 7:
c[0]="31";
c[1]="agon";
break;
case 8:
c[0]="32";
c[1]="stone golem";
break;
}
break;
case 8:
switch (b){
case 1:
c[0]="62";
c[1]="mutant";
break;
case 2:
c[0]="60";
c[1]="bloody wolf";
break;
case 3:
c[0]="57";
c[1]="iron wheel";
break;
case 4:
c[0]="58";
c[1]="tantallos";
break;
case 5:
c[0]="61";
c[1]="vim knigth";
break;
case 6:
c[0]="59";
c[1]="zaiban";
break;
case 7:
c[0]="63";
c[1]="dark guardian";
break;
}
break;
}

return c;
}

public int getMap(int index){
int numero=-1;
switch (index){
case 1:
numero=0;
break;
case 2:
numero=3;
break;
case 3:
numero=2;
break;
case 4:
numero=1;
break;
case 5:
numero=4;
break;
case 6:
numero=6;
break;
case 7:
numero=7;
break;
case 8:
numero=8;
break;
case 9:
numero=10;
break;
}
return numero;
}
}