function getHue(range) {
    var c = function () { return Math.floor(Math.random()*range); }
    return "rgb(" + c() + "," + c() + "," + c() + ")";
  }
  function getTable(size, range) {
    var s = "<table>";
    for (var i=0; i<size; i++) {
      s += "<tr height='10px'>";
      for (var j=0; j<size; j++)
      s += "<td width='10px' style=\"background-color:" + getHue(range) +
      "\">" + "     </td>";
      s += "</tr>";
    }
    s += "</table>";
  return s;
  }


 /* var s = getTable(Math.floor(Math.random()*40 + 1), 256);
  document.writeln(s); */
  