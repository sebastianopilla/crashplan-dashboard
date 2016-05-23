<!DOCTYPE html>
<html>
<head>
  <title>Backup Usage Report ${.now?string["yyyy-MM-dd HH:mm:ss"]}</title>
  <script src="/js/jquery-2.2.3.min.js"></script>
  <script src="/js/kickstart.js"></script>
  <link rel="stylesheet" href="/css/kickstart.css" media="all" />
  <link rel="stylesheet" href="/css/style.css" media="all" />
</head>
<body>
<h2>Backup Usage Report ${.now?string["yyyy-MM-dd HH:mm:ss"]}</h2>
<#assign targets = usageData?keys>
<table>
<#list targets as target>
  <#assign computers = usageData[target]>
  <tr><td>&nbsp;</td></tr>
  <tr><td>${target}</td></tr>
  <tr>
    <td>
      <table class="striped tight sortable">
        <thead>
          <tr>
            <th>Computer</th>
            <th>Last Connected</th>
            <th>Last Backup</th>
            <th>Last Completed Backup</th>
            <th>Percent Complete</th>
            <th>Selected Files</th>
            <th>Selected Bytes</th>
            <th>Remaining Files</th>
            <th>Remaining Bytes</th>
          </tr>
        </thead>
        <tbody>
        <#list computers as computer>
          <tr>
            <td>${computer.computerName}</td>
            <td><#if computer.lastConnected??>${computer.lastConnected?string["yyyy-MM-dd HH:mm:ss"]}<#else>-</#if></td>
            <td><#if computer.lastBackup??>${computer.lastBackup?string["yyyy-MM-dd HH:mm:ss"]}<#else>-</#if></td>
            <td><#if computer.lastCompletedBackup??>${computer.lastCompletedBackup?string["yyyy-MM-dd HH:mm:ss"]}<#else>-</#if></td>
            <td>${computer.percentComplete}</td>
            <td>${computer.selectedFiles}</td>
            <td>${computer.selectedBytes}</td>
            <td>${computer.remainingFiles}</td>
            <td>${computer.remainingBytes}</td>
          </tr>
        </#list>
        </tbody>
      </table>
    </td>
  </tr>
</#list>
</table>
</body>
</html>
