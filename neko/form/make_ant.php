<?php
	$files = file("dir-cs.txt");
	echo count($files);

$tag =<<<EOB
	<target name="%%BASENAME%%">
 		<get 
			src="\${github.path}%%PATH%%"
    	 dest="\${env.TEMP}\Main.cs"/>
    <exec executable="csws.exe">
      <arg value="\${env.TEMP}\Main.cs" />
    </exec>
	</target>
EOB;

foreach($files as $file){
	$output = str_replace("%%BASENAME%%",basename(trim($file)), $tag);
	$output = str_replace("%%PATH%%",trim($file), $output);
	$output = str_replace("neko/form/","", $output);
	echo $output."\n\n";
}
?>