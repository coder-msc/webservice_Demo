var pager = new ETNGpager('list','list2',8,5);//8为每页显示条数。5为导航显示菜单数
var curP = 1;
page()
function page(i){
curP =(curP>pager.cntP)?1:curP;
if(i){
curP = n =i;
}else{
n = curP++;
}
pager.curP = (n>pager.cntP)?pager.cntP:n;
pager.create();
}
//-->
