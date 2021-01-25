<h3>Requisitos para executar o projeto</h3>
<ul>
    <li style="padding-bottom: 15px;">
        <a href="https://sdkman.io/">Java 11 (recomendável instalar pelo SDK MAN)</a>
    </li>
    <li style="padding-bottom: 15px;"> Maven (também é recomendável instalar pelo SDK MAN) </li>
    <li style="padding-bottom: 15px;"> Node.js 10 ou superior (para executar o servidor do Appium) </li>
    <li style="padding-bottom: 15px;">
        <a href="https://www.npmjs.com/get-npm">NPM (node package manager, para instalar o Appium)</a>
    </li>
    <li style="padding-bottom: 15px;">
        <a href="https://www.npmjs.com/package/appium">Appium </a>
    </li>
    <li style="padding-bottom: 15px;">
        <a href="https://developer.android.com/studio/command-line">Ter o Android Studio ou apenas suas ferramentas de
            linha de comando</a>
    </li>
    <li style="padding-bottom: 15px;">
        Ter um dispositivo (virtual ou real) para executar os testes
    </li>
    <li style="padding-bottom: 15px;">Inserir as configurações de seu dispositivo:
        <div>
            src/test/java/fretbras/android/data/Constants.java:15: public static final DeviceCapabilities[]
            DEVICES_CAPABILITIES = {
        </div>
    </li>
    <li style="padding-bottom: 15px;">E habilitar as configurarações em seguida:
        <div>
            src/test/java/fretbras/android/specs/StepDefinition.java:25: final int device = 0;
        </div>
    </li>
</ul>

<br>

<h3>Como compilar e executar os testes</h3>

<h5>Manter o Appium aberto em uma aba ou janela do terminal:</h5>
<ul>
    <li> $ appium </li>
</ul>

<h5>Para compilar e executar os testes, executar este comando dentro da pasta do projeto em outra aba:</h5>
<ul>
    <li> $ mvn clean package </li>
</ul>