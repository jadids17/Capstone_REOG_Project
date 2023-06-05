FROM node:14.21.2-alpine
WORKDIR /usr/backend
ENV PORT 8080
COPY package*.json ./

RUN npm install --production
EXPOSE 8080
COPY server.js .

CMD ["node", "server.js"]
